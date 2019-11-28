package com.mryx.logistics.order.core.orderxxx.support;

import com.mryx.logistics.order.core.orderxxx.convert.ReturnInfo;
import com.mryx.logistics.order.core.orderxxx.model.dto.OrderDTO;

/**
 * yyy订单服务
 * @author maqiqi
 * @date 2019-11-28
 */
public interface YyyOrderSupport {

    ReturnInfo createOrder(OrderDTO orderDTO);

    ReturnInfo selectByOrderId(Long orderId);
}
