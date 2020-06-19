package com.factory;

import com.infrasturcture.DomainConst;
import com.rice.noodle.ZhangWuJiRiceNoodle;
import com.rice.noodle.IRiceNoodle;
import com.rice.noodle.LuoZhixiangRiceNoodle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zx
 * @date 2020/6/19 10:26
 * @modified By:
 */
public class RiceNoodleFactory {
//    public IRiceNoodle createRiceNoodle(String type) {
//        IRiceNoodle mouse = null;
//        switch (type) {
//            case DomainConst.FENG_ZHANG:
//                mouse = new FengZhangRiceNoodle();
//                break;
//            case DomainConst.XIAO_ZHANG:
//                mouse = new XiaoZhangRiceNoodle();
//                break;
//            default:
//                break;
//        }
//        return mouse;
//    }


    private static final Map<String, Class<? extends IRiceNoodle>> map = new HashMap<>();

    static {
        map.put(DomainConst.FENG_ZHANG, ZhangWuJiRiceNoodle.class);
        map.put(DomainConst.XIAO_ZHANG, LuoZhixiangRiceNoodle.class);
    }

    public static IRiceNoodle createMouse(String type) {
        //获取类
        Class clazz = map.get(type);
        try {
            //返回类实例
            return (IRiceNoodle) Class.forName(clazz.getName()).newInstance();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
