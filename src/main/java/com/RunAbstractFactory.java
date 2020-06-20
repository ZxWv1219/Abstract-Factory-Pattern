package com;

import com.factory.*;
import com.infrasturcture.DomainConst;
import com.rice.noodle.IRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 9:01
 * @modified By:
 */
public class RunAbstractFactory {
    public static void main(String[] args) {
        abstractFactory(new JackyRSRNFactory());
        abstractFactory(new JayRSRNFactory());
    }

    /**
     * 抽象工厂模式
     */
    private static void abstractFactory(IRSRNFactory irsrnFactory) {
        System.out.println("+++++++++++++++++++abstractFactory+++++++++++++++++++");
        System.out.println(irsrnFactory.createFixings().produceFixings());
        System.out.println(irsrnFactory.createRiceNoodle().produce());
    }
}
