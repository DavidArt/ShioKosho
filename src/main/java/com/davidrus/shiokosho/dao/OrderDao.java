package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Order;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 26-May-17.
 */
@Repository
public interface OrderDao {

    boolean createOrder(Order order);

    Order getOrderById(Long id);

    boolean updateOrder(Order order);

    boolean deleteOrder(Long id);

}
