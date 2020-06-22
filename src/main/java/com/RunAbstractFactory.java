package com;

import com.factory.*;
import com.producer.RSRNFactoryProducer;

/**
 * @author Zx
 * @date 2020/6/19 9:01
 * @modified By:
 */
public class RunAbstractFactory {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++abstractFactory+++++++++++++++++++");
        IRSRNFactory jackyRSRNFactory = new JackyRSRNFactory();
        jackyRSRNFactory.createRiceNoodle().produce();
        jackyRSRNFactory.createFixings().produceFixings();

        IRSRNFactory jayRSRNFactory = new JayRSRNFactory();
        jayRSRNFactory.createRiceNoodle().produce();
        jayRSRNFactory.createFixings().produceFixings();


        System.out.println("+++++++++++++++++++FactoryProducer+++++++++++++++++++");
        IRSRNFactory jayFactory = RSRNFactoryProducer.createRSRNFactory("周杰伦");
        IRSRNFactory jackyFactory = RSRNFactoryProducer.createRSRNFactory("张学友");
        if (jayFactory != null) {
            jayFactory.createRiceNoodle().produce();
            jayFactory.createFixings().produceFixings();
        }
        if (jackyFactory != null) {
            jackyFactory.createRiceNoodle().produce();
            jackyFactory.createFixings().produceFixings();
        }

    }

}
