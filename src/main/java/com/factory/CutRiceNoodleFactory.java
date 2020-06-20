package com.factory;

import com.rice.noodle.IRiceNoodle;
import com.rice.noodle.CutRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 15:48
 * @modified By:
 */
public class CutRiceNoodleFactory implements IRiceNoodleFactory {
    @Override
    public IRiceNoodle createRiceNoodle() {
        return new CutRiceNoodle();
    }
}
