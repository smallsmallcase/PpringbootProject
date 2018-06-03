package com.huj.sell.service.impl;

import com.huj.sell.dataobject.ProductCategory;
import com.huj.sell.repository.ProductCategoryRepository;
import com.huj.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 类目
 * Package: com.huj.sell.service.impl
 * Author: smallcase
 * Date: Created in 2018/5/31 20:32
 */

@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private ProductCategoryRepository repository;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
