package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dao.RestaurantDao;
import com.davidrus.shiokosho.dto.Restaurant;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 29-May-17.
 */
@Service
@Slf4j
public class RestaurantServiceImpl implements RestaurantService {

    @Resource
    private Mapper mapper;

    @Resource
    private RestaurantDao restaurantDao;

    @Override
    public boolean createRestaurant(Restaurant restaurant) {
        com.davidrus.shiokosho.domain.Restaurant restaurantDomain = mapper.map(restaurant, com.davidrus.shiokosho.domain.Restaurant.class);
        return restaurantDao.createRestaurant(restaurantDomain);
    }

    @Override
    public Restaurant getRestaurantById(Long id) {
        com.davidrus.shiokosho.domain.Restaurant restaurantDomain = restaurantDao.getRestaurantById(id);
        Restaurant restaurantDto = mapper.map(restaurantDomain, Restaurant.class);
        return restaurantDto;
    }

    @Override
    public Restaurant getRestaurantByName(String restaurantName) {
        com.davidrus.shiokosho.domain.Restaurant restaurantDomain = restaurantDao.getRestaurantByName(restaurantName);
        Restaurant restaurantDto = mapper.map(restaurantDomain, Restaurant.class);
        return restaurantDto;
    }

    @Override
    public boolean updateRestaurant(Restaurant restaurant) {
        com.davidrus.shiokosho.domain.Restaurant restaurantDomain = mapper.map(restaurant, com.davidrus.shiokosho.domain.Restaurant.class);
        return restaurantDao.updateRestaurant(restaurantDomain);
    }

    @Override
    public boolean deleteRestaurant(Long id) {
        return restaurantDao.deleteRestaurant(id);
    }
}
