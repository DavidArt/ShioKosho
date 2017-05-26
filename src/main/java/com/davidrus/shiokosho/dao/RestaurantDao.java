package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Restaurant;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 26-May-17.
 */
@Repository
public interface RestaurantDao {

    boolean createRestaurant(Restaurant restaurant);

    Restaurant getRestaurantById(Long id);

    Restaurant getRestaurantByName(String restaurantName);

    boolean updateRestaurant(Restaurant restaurant);

    boolean deleteRestaurant(Long id);

}
