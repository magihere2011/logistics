package com.mryx.logistics.order.core.service;

import com.mryx.logistics.order.core.convert.ReturnInfo;
import com.mryx.logistics.order.core.model.Order;

/**
 * @author maqiqi
 * @date 2019-11-26
 */
public interface OrderService {

    ReturnInfo createOrder(Order order);
}
