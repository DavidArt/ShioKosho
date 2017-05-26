package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.FoodItem;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 26-May-17.
 */
@Repository
public interface FoodItemDao {

    boolean createFoodItem(FoodItem foodItem);

    FoodItem getFoodItemById(Long id);

    boolean updateFoodItem(FoodItem foodItem);

    boolean deleteFoodItem(Long id);

}
