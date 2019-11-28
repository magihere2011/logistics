package com.mryx.logistics.order.core.orderxxx.service;

import com.mryx.logistics.order.core.orderxxx.model.entity.Order;

import java.util.List;

/**
 * @author maqiqi
 * @date 2019-11-26
 */
public interface OrderService {

    int insert(Order order);

    Order selectByOrderId(Long orderId);

    int updateByOrderId(Order order);

    List<Order> selectByCondition(Order order);
}
