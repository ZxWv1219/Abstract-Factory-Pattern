package com.factory;

import com.infrasturcture.DomainConst;
import com.rice.noodle.RoundRiceNoodle;
import com.rice.noodle.IRiceNoodle;
import com.rice.noodle.CutRiceNoodle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zx
 * @date 2020/6/19 10:26
 * @modified By:
 */
public class RiceNoodleFactory {
    public static IRiceNoodle createRiceNoodle(String type) {
        IRiceNoodle riceNoodle = null;
        switch (type) {
            case DomainConst.NOODLE_CUT:
                riceNoodle = new CutRiceNoodle();
                break;
            case DomainConst.NOODLE_ROUND:
                riceNoodle = new RoundRiceNoodle();
                break;
            default:
                break;
        }
        return riceNoodle;
    }

//
//    private static final Map<String, Class<? extends IRiceNoodle>> map = new HashMap<>();
//
//    static {
//        map.put(DomainConst.FENG_ZHANG, RoundRiceNoodle.class);
//        map.put(DomainConst.XIAO_ZHANG, CutRiceNoodle.class);
//    }
//
//    public static IRiceNoodle createRiceNoodle(String type) {
//        //获取类
//        Class clazz = map.get(type);
//        try {
//            //返回类实例
//            return (IRiceNoodle) Class.forName(clazz.getName()).newInstance();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            return null;
//        }
//    }
}
