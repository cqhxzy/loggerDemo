package com.hxzy.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class LoggerDemo {
    private static Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        logger.info("info");
        logger.warn("warn");
        logger.debug("debug");
        logger.error("error");
    }
}
