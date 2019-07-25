package com.hxzy.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calc {

    private static Logger logger = LoggerFactory.getLogger("com.hxzy.demo.Calc");

    public Double div(double num1,double num2){

        if (num2 == 0) {
            logger.error("除数不能为0！",num2);
            throw new ArithmeticException("除数不能为0!");
        }
        logger.info(num1 + "/" + num2 +  "=" + (num1 / num2));
        return num1 / num2;
    }
}
