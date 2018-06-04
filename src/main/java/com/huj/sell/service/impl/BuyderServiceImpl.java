package com.huj.sell.service.impl;

import com.huj.sell.dto.OrderDTO;
import com.huj.sell.enums.ResultEnum;
import com.huj.sell.exception.SellException;
import com.huj.sell.service.BuyerService;
import com.huj.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package: com.huj.sell.service.impl
 * Author: smallcase
 * Date: Created in 2018/6/4 19:38
 */


@Service
@Slf4j
public class BuyderServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;


    @Override
    public OrderDTO findOrderOne(String openId, String orderId) {
        return checkOrderOwner(openId, orderId);
    }

    @Override
    public OrderDTO cancelOrderOne(String openId, String orderId) {
        OrderDTO orderDTO = checkOrderOwner(openId, orderId);
        if (orderDTO == null) {
            log.error("【取消订单】查不到该订单，orderId={}", orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        return orderService.cancel(orderDTO);
    }



    private OrderDTO checkOrderOwner(String openId, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }
        //判断是否自己的订单
        if (!orderDTO.getBuyerOpenid().equalsIgnoreCase(openId)) {
            log.error("【查询订单】订单的openid不一致，openId={},orderDTO={}",orderId, orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER);
        }
        return orderDTO;
    }
}
