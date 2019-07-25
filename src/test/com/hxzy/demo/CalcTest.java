package com.hxzy.demo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;


public class CalcTest {

    @Test
    public void divTest(){
        Calc calc = new Calc();
        double div = calc.div(10, 0);
        assertThat(div,notNullValue());
    }
}