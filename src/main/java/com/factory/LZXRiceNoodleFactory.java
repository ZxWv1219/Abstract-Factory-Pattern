package com.factory;

import com.rice.noodle.IRiceNoodle;
import com.rice.noodle.LuoZhixiangRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 15:48
 * @modified By:
 */
public class LZXRiceNoodleFactory implements IRiceNoodleFactory {
    @Override
    public IRiceNoodle createRiceNoodle() {
        return new LuoZhixiangRiceNoodle();
    }
}
