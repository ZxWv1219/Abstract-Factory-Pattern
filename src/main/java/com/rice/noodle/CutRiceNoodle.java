package com.rice.noodle;

/**
 * 切粉类
 *
 * @author Zx
 * @date 2020/6/19 10:21
 * @modified By:
 */
public class CutRiceNoodle implements IRiceNoodle {
    @Override
    public String produce() {
        System.out.println("切粉");
        return "切粉";
    }
}
