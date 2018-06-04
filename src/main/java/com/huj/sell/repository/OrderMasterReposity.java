package com.huj.sell.repository;

import com.huj.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Package: com.huj.sell.repository
 * Author: smallcase
 * Date: Created in 2018/6/2 10:23
 */
public interface OrderMasterReposity extends JpaRepository<OrderMaster,String> {
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenId, Pageable pageable);
}
