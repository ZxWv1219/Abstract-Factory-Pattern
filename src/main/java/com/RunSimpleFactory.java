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
        System.out.println("+++++++++++++++++++simpleFactory+++++++++++++++++++");
        IRiceNoodle riceNoodle = RiceNoodleFactory.createRiceNoodle(DomainConst.NOODLE_CUT);
        if (riceNoodle != null)
            riceNoodle.produce();
    }
}
