package FoodPack.FoodApp.Services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import FoodPack.FoodApp.Dao.FoodDao;
import FoodPack.FoodApp.Entity.Food;

@Service
public class FoodServiceImpl implements FoodService
{
	
	@Autowired
	private FoodDao foodDao;
	
	
	public FoodServiceImpl() 
	{
		
		
	}


	@Override
	public List<Food> getFoods() {


		return foodDao.findAll();
	}


	@SuppressWarnings("deprecation")
	@Override
	public Food getFood(long foodId) {
		
		return foodDao.getOne(foodId);
	}


	@Override
	public Food addFood(Food food) {
		
		foodDao.save(food);
		return food;
	}


	@Override
	public Food updateFood(Food food) {
		
		return foodDao.save(food);
	}


	@Override
	public void deleteFood(long Parselong) {
		
		Food entity=foodDao.getOne(Parselong);

		return;
		
	}


	


	
	


}
