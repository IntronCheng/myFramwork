package com.subin.framework.mybatis.my;

import com.subin.framework.mybatis.beans.Test;

/**
 * @ Author: levin
 * @ date: 2018/2/28 下午8:59
 * @ description:
 */
public interface TestMapper {
    Test selectByPrimaryKey(Integer userId);
}
