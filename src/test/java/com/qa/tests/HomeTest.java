package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest {

    @Test
    public void home(){
        System.out.println("HOME IS");
        int a = 10;
        int b = 20;
        Assert.assertEquals(30, a+b);
    }

}
