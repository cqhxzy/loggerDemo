package com.hxzy.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class LoggerDemo {
    //得到抽象的logger，通过桥接器，slf4j就能够得到具体的lo4j2的实现
    private static Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {
            double ran = Math.random();
            logger.debug("debug," + ran);
            logger.info("info," + ran);
            logger.warn("warn," + ran);
            logger.error("error," + ran);
        }

        System.out.println("日志输出完毕");
    }
}
