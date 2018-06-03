package com.huj.sell.service;

import com.huj.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package: com.huj.sell.service
 * Author: smallcase
 * Date: Created in 2018/5/31 22:31
 */

public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架的商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有的商品列表
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**加库存*/

    /**减库存*/
}
