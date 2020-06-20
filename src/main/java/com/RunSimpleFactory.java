package com;

import com.factory.*;
import com.infrasturcture.DomainConst;
import com.rice.noodle.IRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 9:01
 * @modified By:
 */
public class RunSimpleFactory {
    public static void main(String[] args) {
        simpleFactory(DomainConst.NOODLE_CUT);
    }

    /**
     * 简单工厂
     */
    private static void simpleFactory(String type) {
        System.out.println("+++++++++++++++++++simpleFactory+++++++++++++++++++");
        IRiceNoodle riceNoodle = RiceNoodleFactory.createRiceNoodle(type);
        if (riceNoodle != null)
            System.out.println(riceNoodle.produce());
    }
}
