package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {


    @Test
    public void login(){
        System.out.println("LOGIN");
        int a = 10;
        int b = 20;
        Assert.assertEquals(30, a+b);
    }

}
