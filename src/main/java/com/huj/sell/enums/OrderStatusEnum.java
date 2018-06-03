package com.huj.sell.enums;

import lombok.Getter;

/**
 * Package: com.huj.sell.enums
 * Author: smallcase
 * Date: Created in 2018/6/2 10:05
 */

@Getter
public enum  OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
    ;

    private Integer code;
    private String massage;

    OrderStatusEnum(Integer code, String massage) {
        this.code = code;
        this.massage = massage;
    }
}
