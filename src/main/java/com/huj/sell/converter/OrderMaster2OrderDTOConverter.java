package com.huj.sell.converter;

import com.huj.sell.dataobject.OrderMaster;
import com.huj.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Package: com.huj.sell.converter
 * Author: smallcase
 * Date: Created in 2018/6/3 17:25
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        List<OrderDTO> orderDTOList = orderMasterList.stream().map(e -> convert(e))
                .collect(Collectors.toList());

        return orderDTOList;

    }
}
