package com.huj.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huj.sell.dataobject.OrderDetail;
import com.huj.sell.dto.OrderDTO;
import com.huj.sell.enums.ResultEnum;
import com.huj.sell.exception.SellException;
import com.huj.sell.from.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: com.huj.sell.converter
 * Author: smallcase
 * Date: Created in 2018/6/4 15:02
 */

@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {

        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerOpenid(orderForm.getOpenId());
        orderDTO.setBuyerAddress(orderForm.getAddress());

        ArrayList<OrderDetail> orderDetailList;

        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {

                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误，string={}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }



        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;

    }
}
