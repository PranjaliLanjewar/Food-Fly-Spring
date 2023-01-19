package FoodPack.FoodApp.Controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import FoodPack.FoodApp.Entity.Food;
import FoodPack.FoodApp.Services.FoodService;
 
@RestController
public class MyController 
{
	
	@Autowired
    private FoodService foodservice;
	
	@GetMapping("/home")
	public String Home() {
		return "Welcome to Food Delivery Application ";
	}
	
	@GetMapping("/foods")
	public List<Food> getFoods() {

		return  this.foodservice.getFoods();
	}
	
	@GetMapping("/foods/{foodId}")
	public Food getFood(@PathVariable String foodId) {
		
		return this.foodservice.getFood(Long.parseLong(foodId));
	}
	@PostMapping("/foods")
	public Food addFood(@RequestBody Food food) {
		return this.foodservice.addFood(food);
	}
	
	@PutMapping("/foods")
	public Food updateFood(@RequestBody Food food) {
		return this.foodservice.updateFood(food);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteFood(@PathVariable String id){
		
		try {
			this.foodservice.deleteFood(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	}
	

	

