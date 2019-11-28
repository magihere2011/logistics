package com.mryx.logistics.order.core.orderyyy.service;

import com.mryx.logistics.order.core.orderxxx.convert.ReturnInfo;
import com.mryx.logistics.order.core.orderxxx.model.entity.Order;

/**
 * @author maqiqi
 * @date 2019-11-26
 */
public interface OrderService {

    ReturnInfo createOrder(Order order);
}
