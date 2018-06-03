package com.huj.sell.repository;

import com.huj.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Package: com.huj.sell.repository
 * Author: smallcase
 * Date: Created in 2018/6/2 10:30
 */
public interface OrderDetailReposity extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String orderId);
}
