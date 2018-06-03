package com.huj.sell.dataobject;

import com.huj.sell.enums.OrderStatusEnum;
import com.huj.sell.enums.PayStatusENum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Package: com.huj.sell.dataobject
 * Author: smallcase
 * Date: Created in 2018/6/2 9:56
 */

@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /**订单ID.*/
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**支付状态，默认为0，未支付*/
    private Integer payStatus = PayStatusENum.WAIT.getCode();

    public OrderMaster() {
    }


    //    /**创建时间*/
//    private Date createTime;
//
//    /**更新时间*/
//    private Date updateTime;


    }

