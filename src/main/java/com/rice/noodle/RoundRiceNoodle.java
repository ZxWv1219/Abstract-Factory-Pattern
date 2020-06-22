package com.rice.noodle;

/**
 * 榨粉类
 *
 * @author Zx
 * @date 2020/6/19 10:21
 * @modified By:
 */
public class RoundRiceNoodle implements IRiceNoodle {
    @Override
    public String produce() {
        System.out.println("榨粉");
        return "榨粉";
    }
}
