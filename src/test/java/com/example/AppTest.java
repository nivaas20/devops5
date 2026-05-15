package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testFact() {

        App app = new App();

        int result = app.fact(4);

        System.out.println("Running: " + result);

        Assert.assertEquals(24, result);
    }
}