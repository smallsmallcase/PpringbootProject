package com.huj.sell.enums;

import lombok.Getter;

/**
 * Package: com.huj.sell.enums
 * Author: smallcase
 * Date: Created in 2018/5/31 22:40
 */

@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
