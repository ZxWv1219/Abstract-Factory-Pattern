package com;

import com.factory.*;
import com.infrasturcture.DomainConst;
import com.producer.RiceNoodleFactoryProducer;
import com.rice.noodle.IRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 9:01
 * @modified By:
 */
public class RunFactory {
    public static void main(String[] args) {

        System.out.println("+++++++++++++++++++factory+++++++++++++++++++");
        IRiceNoodleFactory riceNoodleFactory = new CutRiceNoodleFactory();
        riceNoodleFactory.createRiceNoodle().produce();


        IRiceNoodleFactory cutFactory = RiceNoodleFactoryProducer.createRiceNoodle(DomainConst.NOODLE_CUT);
        IRiceNoodleFactory roundFactory = RiceNoodleFactoryProducer.createRiceNoodle(DomainConst.NOODLE_ROUND);
        System.out.println("+++++++++++++++++++FactoryProducer+++++++++++++++++++");
        if (cutFactory != null) cutFactory.createRiceNoodle().produce();
        if (roundFactory != null) roundFactory.createRiceNoodle().produce();
    }
}
