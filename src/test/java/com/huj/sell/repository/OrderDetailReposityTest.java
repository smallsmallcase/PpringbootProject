package com.huj.sell.repository;

import com.huj.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Package: com.huj.sell.repository
 * Author: smallcase
 * Date: Created in 2018/6/2 19:36
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailReposityTest {

    @Autowired
    private OrderDetailReposity reposity;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1123446");
        orderDetail.setOrderId("123457");
        orderDetail.setProductName("牛奶");
        orderDetail.setProductIcon("xxxxx.png");
        orderDetail.setProductPrice(new BigDecimal(24.5));
        orderDetail.setProductQuantity(333);
        orderDetail.setProductId("11121");

        OrderDetail result = reposity.save(orderDetail);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = reposity.findByOrderId("123457");
        Assert.assertNotNull(orderDetailList.size());
    }
}