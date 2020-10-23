package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Multiplication;

public class TestMultiplication {

    private Multiplication multi;

    /**
     *Method called before each method containing a test
     * @throws Exception exception generated
     */
    @Before
    public void setUp() throws Exception {
        this.multi = new Multiplication(2, 3);
    }

    /**
     * Method called after each method containing a test
     * @throws Exception exception generated
     */
    @After
    public void tearDown() throws Exception {

    }

    /**
     * Test method for {@link com.akicalculator.models.Multiplication#apply()}
     */
    @Test
    public void testApply() {
        final float result = this.multi.apply();

        Assert.assertEquals(6.0f, result, 0.0f);
    }

}
