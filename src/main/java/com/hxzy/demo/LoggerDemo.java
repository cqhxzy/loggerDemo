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
        logger.info("info");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");
    }
}
