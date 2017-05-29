package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dao.OrderDao;
import com.davidrus.shiokosho.dto.Order;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 29-May-17.
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private Mapper mapper;

    @Resource
    private OrderDao orderDao;

    @Override
    public boolean createOrder(Order order) {
        com.davidrus.shiokosho.domain.Order orderDomain = mapper.map(order, com.davidrus.shiokosho.domain.Order.class);
        return orderDao.createOrder(orderDomain);
    }

    @Override
    public Order getOrderById(Long id) {
        com.davidrus.shiokosho.domain.Order orderDomain = orderDao.getOrderById(id);
        Order orderDto = mapper.map(orderDomain, Order.class);
        return orderDto;
    }

    @Override
    public boolean updateOrder(Order order) {
        com.davidrus.shiokosho.domain.Order orderDomain = mapper.map(order, com.davidrus.shiokosho.domain.Order.class);
        return orderDao.updateOrder(orderDomain);
    }

    @Override
    public boolean deleteOrder(Long id) {
        return orderDao.deleteOrder(id);
    }
}
