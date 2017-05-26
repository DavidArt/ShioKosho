package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Restaurant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 * Created by david on 26-May-17.
 */
@Repository
@Slf4j
public class RestaurantDaoImpl implements RestaurantDao {

    @PersistenceContext
    public EntityManager em;


    @Override
    @Transactional
    public boolean createRestaurant(Restaurant restaurant) {
        em.persist(restaurant);

        return true;
    }

    @Override
    public Restaurant getRestaurantById(Long id) {
        TypedQuery<Restaurant> query = em.createNamedQuery(Restaurant.GET_RESTAURANT_BY_ID, Restaurant.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    @Override
    public Restaurant getRestaurantByName(String restaurantName) {
        TypedQuery<Restaurant> query = em.createNamedQuery(Restaurant.GET_RESTAURANT_BY_NAME, Restaurant.class);
        query.setParameter("name", restaurantName);

        return query.getSingleResult();
    }

    @Override
    @Transactional
    public boolean updateRestaurant(Restaurant restaurant) {
        em.merge(restaurant);

        return true;
    }

    @Override
    @Transactional
    public boolean deleteRestaurant(Long id) {
        TypedQuery<Restaurant> query = em.createNamedQuery(Restaurant.GET_RESTAURANT_BY_ID, Restaurant.class);
        query.setParameter("id", id);
        Restaurant restaurant = query.getSingleResult();
        em.remove(restaurant);

        return true;
    }
}
