package com.huj.sell.from;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Package: com.huj.sell.from
 * Author: smallcase
 * Date: Created in 2018/6/4 14:44
 */

@Data
public class OrderForm {
    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    //手机号
    @NotEmpty(message = "手机号必填")
    private String phone;

    //买家地址

    @NotEmpty(message = "地址必填")
    private String address;

    //买家微信openId
    @NotEmpty(message = "openId")
    private String openId;

    //购物车
    @NotEmpty(message = "购物车不能为空")
    private String items;

}
