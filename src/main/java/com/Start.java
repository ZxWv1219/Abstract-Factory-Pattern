package com;

import com.factory.*;
import com.infrasturcture.DomainConst;
import com.rice.noodle.IRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 9:01
 * @modified By:
 */
public class Start {
    public static void main(String[] args) {


//        simpleFactory();
//        factory(new LZXRiceNoodleFactory());
        abstractFactory(new JackyRSRNFactory());
    }

    /**
     * 简单工厂
     */
    private static void simpleFactory() {
        IRiceNoodle riceNoodle = RiceNoodleFactory.createMouse(DomainConst.FENG_ZHANG);
        if (riceNoodle != null)
            System.out.println(riceNoodle.sayHello());
    }

    /**
     * 工厂模式
     */
    private static void factory(IRiceNoodleFactory riceNoodleFactory) {
        System.out.println(riceNoodleFactory.createRiceNoodle().sayHello());
    }

    /**
     * 抽象工厂模式
     */
    private static void abstractFactory(IRSRNFactory irsrnFactory) {
        System.out.println(irsrnFactory.createFixings().produceFixings());
        System.out.println(irsrnFactory.createRiceNoodle().sayHello());
    }
}
