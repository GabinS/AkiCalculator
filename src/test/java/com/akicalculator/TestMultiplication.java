package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Multiplication;

public class TestMultiplication {

    private Multiplication multi;

    @Before
    public void setUp() throws Exception {
        this.multi = new Multiplication(2, 3);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testApply() {
        final float result = this.multi.apply();

        Assert.assertEquals(6.0f, result, 0.0f);
    }


}
