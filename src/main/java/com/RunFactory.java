package com;

import com.factory.*;
import com.infrasturcture.DomainConst;
import com.rice.noodle.IRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 9:01
 * @modified By:
 */
public class RunFactory {
    public static void main(String[] args) {
        factory(new CutRiceNoodleFactory());
        factory(new RoundRiceNoodleFactory());
    }

    /**
     * 工厂模式
     */
    private static void factory(IRiceNoodleFactory riceNoodleFactory) {
        System.out.println("+++++++++++++++++++factory+++++++++++++++++++");
        System.out.println(riceNoodleFactory.createRiceNoodle().produce());
    }
}
