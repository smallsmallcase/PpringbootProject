package com.huj.sell.repository;

import com.huj.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Package: com.huj.sell.repository
 * Author: smallcase
 * Date: Created in 2018/5/31 22:02
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
