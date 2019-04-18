package com.subin.framework.mybatis.my;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author: levin
 * @ date: 2018/2/28 下午8:58
 * @ description:
 */
public class TestMapperXml {
    public static final String nameSpace = "com.subin.framework.mybatis.my.TestMapper";

    public static final Map<String, String> methodSqlMapping = new HashMap<String, String>();

    static {
        methodSqlMapping.put("selectByPrimaryKey", "select * from test where id = %d");
    }
}
