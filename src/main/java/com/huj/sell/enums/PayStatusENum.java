package com.huj.sell.enums;

import lombok.Getter;

/**
 * Package: com.huj.sell.enums
 * Author: smallcase
 * Date: Created in 2018/6/2 10:09
 */

@Getter
public enum PayStatusENum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付完成")

    ;
    private Integer code;
    private String message;

    PayStatusENum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
