package com.huj.sell.view;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Package: com.huj.sell.view
 * Author: smallcase
 * Date: Created in 2018/6/1 9:47
 */

@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;
}
