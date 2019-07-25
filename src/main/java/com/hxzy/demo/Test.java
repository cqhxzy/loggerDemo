package com.hxzy.demo;

import java.util.Properties;
import java.util.Set;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Properties properties = System.getProperties();//获取关于当前jvm以及操作系统相关的参数
        Set<String> set = properties.stringPropertyNames();
        set.stream().forEach(t->{
            String value = properties.getProperty(t);
            System.out.println("key:" + t + ",\tvalue:" + value);
        });
    }
}
