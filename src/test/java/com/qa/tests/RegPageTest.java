package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegPageTest {


        @Test
        public void reg(){
            System.out.println("REG");
            int a = 30;
            int b = 20;
            Assert.assertEquals(50, a+b);
        }
}
