package com.akicalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Subtraction;

/**
 * Subtraction class test.
 */
public class TestSubstraction {

    /**
     * The subtraction to test.
     */
    private Subtraction substract;

    /**
     * Method called before each method containing a test
     * @throws Exception exception generated
     */
    @Before
    public void setUp() throws Exception {
        this.substract = new Subtraction(5, 3);
    }

    /**
     * Test method for {@link com.akicalculator.models.Substraction#apply()}.
     */
    @Test
    public void testApply() {
        final float result = this.substract.apply();

        Assert.assertEquals(2.0f, result, 0.0f);
    }

}
