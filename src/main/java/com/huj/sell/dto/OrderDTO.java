package com.huj.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huj.sell.dataobject.OrderDetail;
import com.huj.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Package: com.huj.sell.dto
 * Author: smallcase
 * Date: Created in 2018/6/3 9:41
 */
@Data
@DynamicUpdate
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /**订单ID.*/
    private String orderId;

    /**买家名字.*/
    private String buyerName;

    /**买家手机号*/
    private String buyerPhone;

    /**买家地址*/
    private String buyerAddress;

    /**买家微信*/
    private String buyerOpenid;

    /**订单总金额.*/
    private BigDecimal orderAmount;

    /**订单状态，默认为新下单.*/
    private Integer orderStatus;

    /**支付状态，默认为0，未支付*/
    private Integer payStatus;

    /**创建时间*/

    @Column(updatable = false)
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**更新时间*/

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;


    private List<OrderDetail> orderDetailList;

    public OrderDTO() {
    }

    public OrderDTO(String orderId, String buyerName, String buyerPhone, String buyerAddress, String buyerOpenid, BigDecimal orderAmount, Integer orderStatus, Integer payStatus, List<OrderDetail> orderDetailList) {
        this.orderId = orderId;
        this.buyerName = buyerName;
        this.buyerPhone = buyerPhone;
        this.buyerAddress = buyerAddress;
        this.buyerOpenid = buyerOpenid;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
        this.payStatus = payStatus;
        this.orderDetailList = orderDetailList;
    }
}
