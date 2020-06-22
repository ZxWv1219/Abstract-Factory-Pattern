package com.producer;

import com.factory.CutRiceNoodleFactory;
import com.factory.IRiceNoodleFactory;
import com.factory.RoundRiceNoodleFactory;
import com.infrasturcture.DomainConst;

import java.util.HashMap;
import java.util.Map;

/**
 * 米粉生成器
 *
 * @author Zx
 * @date 2020/6/22 9:46
 * @modified By:
 */
public class RiceNoodleFactoryProducer {


    private static final Map<String, Class<? extends IRiceNoodleFactory>> map = new HashMap<>();

    static {
        map.put(DomainConst.NOODLE_ROUND, RoundRiceNoodleFactory.class);
        map.put(DomainConst.NOODLE_CUT, CutRiceNoodleFactory.class);
    }

    public static IRiceNoodleFactory createRiceNoodle(String type) {
        try {
            return map.get(type).newInstance();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
