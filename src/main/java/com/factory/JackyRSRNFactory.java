package com.factory;

import com.fixings.IFixings;
import com.fixings.LiLeiFixings;
import com.rice.noodle.IRiceNoodle;
import com.rice.noodle.ZhangWuJiRiceNoodle;

/**
 * 张学友的螺蛳粉厂
 *
 * @author Zx
 * @date 2020/6/19 16:39
 * @modified By:
 */
public class JackyRSRNFactory implements IRSRNFactory {
    @Override
    public IFixings createFixings() {
        return new LiLeiFixings();
    }

    @Override
    public IRiceNoodle createRiceNoodle() {
        return new ZhangWuJiRiceNoodle();
    }
}
