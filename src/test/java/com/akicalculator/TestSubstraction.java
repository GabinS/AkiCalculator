package com.akicalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Subtraction;

/***
 * Subtraction class test.
 */
public class TestSubstraction {

    /**
     * The subtraction to test.
     */
    private Subtraction substract;

    /**
     * Init the value to subtract.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        this.substract = new Subtraction(5, 3);
    }

    /**
     * Apply the subtract command.
     */
    @Test
    public void testApply() {
        final float result = this.substract.apply();

        Assert.assertEquals(2.0f, result, 0.0f);
    }

}
