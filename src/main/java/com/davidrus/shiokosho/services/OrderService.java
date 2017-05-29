package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dto.Order;
import org.springframework.stereotype.Service;

/**
 * Created by david on 29-May-17.
 */
@Service
public interface OrderService {

    boolean createOrder(Order order);

    Order getOrderById(Long id);

    boolean updateOrder(Order order);

    boolean deleteOrder(Long id);

}
