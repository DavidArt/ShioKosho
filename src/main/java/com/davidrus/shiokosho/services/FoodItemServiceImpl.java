package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dao.FoodItemDao;
import com.davidrus.shiokosho.dto.FoodItem;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 29-May-17.
 */
@Service
@Slf4j
public class FoodItemServiceImpl implements FoodItemService{

    @Resource
    private Mapper mapper;

    @Resource
    private FoodItemDao foodItemDao;

    @Override
    public boolean createFoodItem(FoodItem foodItem) {
        com.davidrus.shiokosho.domain.FoodItem foodItemDomain = mapper.map(foodItem, com.davidrus.shiokosho.domain.FoodItem.class);
        return foodItemDao.createFoodItem(foodItemDomain);
    }

    @Override
    public FoodItem getFoodItemById(Long id) {
        com.davidrus.shiokosho.domain.FoodItem foodItemDomain = foodItemDao.getFoodItemById(id);
        FoodItem foodItemDto = mapper.map(foodItemDomain, FoodItem.class);
        return foodItemDto;
    }

    @Override
    public boolean updateFoodItem(FoodItem foodItem) {
        com.davidrus.shiokosho.domain.FoodItem foodItemDomain = mapper.map(foodItem, com.davidrus.shiokosho.domain.FoodItem.class);
        return foodItemDao.updateFoodItem(foodItemDomain);
    }

    @Override
    public boolean deleteFoodItem(Long id) {
        return foodItemDao.deleteFoodItem(id);
    }
}
