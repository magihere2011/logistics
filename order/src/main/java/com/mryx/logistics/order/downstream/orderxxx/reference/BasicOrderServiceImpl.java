package com.mryx.logistics.order.downstream.orderxxx.reference;

import com.mryx.logistics.order.core.orderxxx.convert.ReturnInfo;
import com.mryx.logistics.order.core.orderxxx.model.dto.OrderDTO;

/**
 * @author maqiqi
 * @date 2019-11-28
 */
public class BasicOrderServiceImpl {

    /**
     * 公司级别通用下单
     */
//    @Reference
//    private BasicOrderService basicOrderService;


    public ReturnInfo createOrder(OrderDTO orderDTO){
//        basicOrderService.create(xxx);
        return ReturnInfo.success();
    }
}
