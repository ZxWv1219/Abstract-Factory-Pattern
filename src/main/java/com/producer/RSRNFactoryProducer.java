package com.producer;


import com.factory.IRSRNFactory;
import com.factory.JackyRSRNFactory;
import com.factory.JayRSRNFactory;
import com.factory.RoundRiceNoodleFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 螺蛳粉生成器
 *
 * @author Zx
 * @date 2020/6/22 9:43
 * @modified By:
 */
public class RSRNFactoryProducer {

    private static final Map<String, Class<? extends IRSRNFactory>> map = new HashMap<>();

    static {
        map.put("张学友", JackyRSRNFactory.class);
        map.put("周杰伦", JayRSRNFactory.class);
    }

    public static IRSRNFactory createRSRNFactory(String type) {
        try {
            //返回类实例
            return map.get(type).newInstance();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
