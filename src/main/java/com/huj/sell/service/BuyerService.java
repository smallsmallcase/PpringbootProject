package com.huj.sell.service;

import com.huj.sell.dto.OrderDTO;

/**
 *
 * 买家
 * Package: com.huj.sell.service
 * Author: smallcase
 * Date: Created in 2018/6/4 19:35
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openId, String orderId);
    //取消订单
    OrderDTO cancelOrderOne(String openId, String orderId);


}
