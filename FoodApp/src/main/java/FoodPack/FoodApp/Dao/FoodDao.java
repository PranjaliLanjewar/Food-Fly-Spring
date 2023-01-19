package FoodPack.FoodApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import FoodPack.FoodApp.Entity.Food;

public interface FoodDao extends JpaRepository<Food, Long>
 {

}
