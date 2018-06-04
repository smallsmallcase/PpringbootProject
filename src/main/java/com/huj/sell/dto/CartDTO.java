package com.huj.sell.dto;

import lombok.Data;

/**
 * Package: com.huj.sell.dto
 * Author: smallcase
 * Date: Created in 2018/6/3 11:05
 */
@Data
public class CartDTO {

    /**商品Id.*/
    private String productId;

    /**数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
