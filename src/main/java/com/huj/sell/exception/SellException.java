package com.huj.sell.exception;

import com.huj.sell.enums.ResultEnum;

/**
 * Package: com.huj.sell.exception
 * Author: smallcase
 * Date: Created in 2018/6/3 10:10
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code=code;
    }
}
