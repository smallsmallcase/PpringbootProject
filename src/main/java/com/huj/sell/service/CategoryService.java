package com.huj.sell.service;

import com.huj.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * Package: com.huj.sell.service
 * Author: smallcase
 * Date: Created in 2018/5/31 20:28
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
