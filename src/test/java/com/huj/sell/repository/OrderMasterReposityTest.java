package com.huj.sell.repository;

import com.huj.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Package: com.huj.sell.repository
 * Author: smallcase
 * Date: Created in 2018/6/2 10:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterReposityTest {
    @Autowired
    private OrderMasterReposity reposity;

    private final String OPENID = "1314";

    @Test
    @Transactional
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();

        orderMaster.setOrderId("123457");
        orderMaster.setBuyerAddress("南京");
        orderMaster.setBuyerName("胡佳琳");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setBuyerPhone("18300000100");
        orderMaster.setOrderAmount(new BigDecimal(3.5));


        OrderMaster result = reposity.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(0, 1);
        Page<OrderMaster> result = reposity.findByBuyerOpenid(OPENID, request);
//        System.out.println(result.getTotalElements());
        Assert.assertNotNull(result.getTotalElements());
    }
}