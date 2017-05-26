package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.FoodItem;
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
public class FoodItemDaoImpl implements FoodItemDao {

    @PersistenceContext
    public EntityManager em;

    @Override
    @Transactional
    public boolean createFoodItem(FoodItem foodItem) {
        em.persist(foodItem);

        return true;
    }

    @Override
    public FoodItem getFoodItemById(Long id) {
        TypedQuery<FoodItem> query = em.createNamedQuery(FoodItem.GET_FOOD_ITEM_BY_ID, FoodItem.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    @Override
    @Transactional
    public boolean updateFoodItem(FoodItem foodItem) {
        em.merge(foodItem);

        return true;
    }

    @Override
    @Transactional
    public boolean deleteFoodItem(Long id) {
        TypedQuery<FoodItem> query = em.createNamedQuery(FoodItem.GET_FOOD_ITEM_BY_ID, FoodItem.class);
        query.setParameter("id", id);
        FoodItem foodItem = query.getSingleResult();
        em.remove(foodItem);

        return true;
    }
}
