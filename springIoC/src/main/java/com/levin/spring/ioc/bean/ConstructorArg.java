package com.levin.spring.ioc.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @ Author: levin
 * @ date: 2018/1/14 上午10:52
 * @ description:
 */
@Data
@ToString
public class ConstructorArg {

    private int index;

    private String ref;

    private String name;
}
