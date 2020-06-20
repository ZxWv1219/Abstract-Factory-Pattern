package com.factory;

import com.rice.noodle.IRiceNoodle;
import com.rice.noodle.RoundRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 15:24
 * @modified By:
 */
public class RoundRiceNoodleFactory implements IRiceNoodleFactory {
    @Override
    public IRiceNoodle createRiceNoodle() {
        return new RoundRiceNoodle();
    }
}
