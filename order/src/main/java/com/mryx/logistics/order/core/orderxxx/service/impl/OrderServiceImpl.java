package com.mryx.logistics.order.core.orderxxx.service.impl;

import com.mryx.logistics.order.core.orderxxx.model.entity.Order;
import com.mryx.logistics.order.core.orderxxx.service.OrderService;

import java.util.List;

/**
 * @author maqiqi
 * @date 2019-11-26
 */
public class OrderServiceImpl implements OrderService {


    @Override
    public int insert(Order order) {
        return 0;
    }

    @Override
    public Order selectByOrderId(Long orderId) {
        return null;
    }

    @Override
    public int updateByOrderId(Order order) {
        return 0;
    }

    @Override
    public List<Order> selectByCondition(Order order) {
        return null;
    }
}
