package com.huj.sell.utils;

import java.util.Random;

/**
 * Package: com.huj.sell.utils
 * Author: smallcase
 * Date: Created in 2018/6/3 10:26
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        int number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);

    }
}
