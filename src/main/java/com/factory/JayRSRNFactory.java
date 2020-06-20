package com.factory;

import com.fixings.HanMeiMeiFixings;
import com.fixings.IFixings;
import com.rice.noodle.IRiceNoodle;
import com.rice.noodle.CutRiceNoodle;

/**
 * 周杰伦的螺蛳粉厂
 *
 * @author Zx
 * @date 2020/6/19 16:37
 * @modified By:
 */
public class JayRSRNFactory implements IRSRNFactory {
    @Override
    public IFixings createFixings() {
        return new HanMeiMeiFixings();
    }

    @Override
    public IRiceNoodle createRiceNoodle() {
        return new CutRiceNoodle();
    }
}
