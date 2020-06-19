package com.factory;

import com.fixings.IFixings;
import com.rice.noodle.IRiceNoodle;

/**
 * @author Zx
 * @date 2020/6/19 16:31
 * @modified By:
 */
public interface IRSRNFactory {
    /**
     * 配菜加工
     *
     * @return
     */
    IFixings createFixings();

    /**
     * 米粉加工
     *
     * @return
     */
    IRiceNoodle createRiceNoodle();
}
