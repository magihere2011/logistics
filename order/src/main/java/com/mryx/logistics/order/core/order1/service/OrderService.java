package com.mryx.logistics.order.core.order1.service;

import com.mryx.logistics.order.core.order1.convert.ReturnInfo;
import com.mryx.logistics.order.core.order1.model.Order;

/**
 * @author maqiqi
 * @date 2019-11-26
 */
public interface OrderService {

    ReturnInfo createOrder(Order order);
}
