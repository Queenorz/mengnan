package dao;

import entity.*;

import java.util.List;

import org.apache.ibatis.annotations.Param;
public interface FoodMapper {
    List<Food> getFoodList(@Param(value="type") String type);
    List<Food> getAll();
    
    List<Food> findAllByName(@Param(value="name") String name);
    
    
    Food findFood(int id);
    void changeInfo (Food food);
    
    
    void delete(int id);
    
    

	void addInfo(Food food);
}
