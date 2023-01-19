package FoodPack.FoodApp.Services;

import java.util.List;

import FoodPack.FoodApp.Entity.Food;

public interface FoodService 
{
	public List<Food> getFoods();
	
	public Food getFood(long foodId);
	
	public Food addFood(Food food);
	
	public Food updateFood(Food food);
	
	public void deleteFood(long Parselong);
}
