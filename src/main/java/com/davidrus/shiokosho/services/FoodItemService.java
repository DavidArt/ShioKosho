package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dto.FoodItem;
import org.springframework.stereotype.Service;

/**
 * Created by david on 29-May-17.
 */
@Service
public interface FoodItemService {

    boolean createFoodItem(FoodItem foodItem);

    FoodItem getFoodItemById(Long id);

    boolean updateFoodItem(FoodItem foodItem);

    boolean deleteFoodItem(Long id);

}
