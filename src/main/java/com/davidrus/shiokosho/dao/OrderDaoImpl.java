package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Order;
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
public class OrderDaoImpl implements OrderDao {

    @PersistenceContext
    public EntityManager em;

    @Override
    @Transactional
    public boolean createOrder(Order order) {
        em.persist(order);

        return true;
    }

    @Override
    public Order getOrderById(Long id) {
        TypedQuery<Order> query = em.createNamedQuery(Order.GET_ORDER_BY_ID, Order.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    @Override
    @Transactional
    public boolean updateOrder(Order order) {
        em.merge(order);

        return true;
    }

    @Override
    @Transactional
    public boolean deleteOrder(Long id) {
        TypedQuery<Order> query = em.createNamedQuery(Order.GET_ORDER_BY_ID, Order.class);
        query.setParameter("id", id);
        Order order = query.getSingleResult();
        em.remove(order);

        return true;
    }
}
