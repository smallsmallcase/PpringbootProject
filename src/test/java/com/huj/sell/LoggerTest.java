package com.huj.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Package: com.huj.sell
 * Author: smallcase
 * Date: Created in 2018/5/29 17:41
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){

        String name = "hujialin";
        String password = "123456";

        log.debug("debug...");
        log.info("info....");
        log.info("name:{},password:{}",name,password);
        log.error("error...");
    }


//    @Test
//    public void test2(){
//        log.debug("debug...");
//        log.info("info....");
//        log.error("error...");
//    }
}
