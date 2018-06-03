package com.huj.sell.repository;

import com.huj.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Package: com.huj.sell.repository
 * Author: smallcase
 * Date: Created in 2018/5/31 11:09
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
