package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dto.Restaurant;
import org.springframework.stereotype.Service;

/**
 * Created by david on 29-May-17.
 */
@Service
public interface RestaurantService {

    boolean createRestaurant(Restaurant restaurant);

    Restaurant getRestaurantById(Long id);

    Restaurant getRestaurantByName(String restaurantName);

    boolean updateRestaurant(Restaurant restaurant);

    boolean deleteRestaurant(Long id);

}
