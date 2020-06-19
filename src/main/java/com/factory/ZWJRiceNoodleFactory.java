package com.factory;

import com.rice.noodle.IRiceNoodle;
import com.rice.noodle.ZhangWuJiRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 15:24
 * @modified By:
 */
public class ZWJRiceNoodleFactory implements IRiceNoodleFactory {
    @Override
    public IRiceNoodle createRiceNoodle() {
        return new ZhangWuJiRiceNoodle();
    }
}
