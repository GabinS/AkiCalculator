package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Power;

/**
 * Power test class.
 */
public class TestPower {

    private Power power;

    /**
     * Method called before each method containing a test
    * @throws java.lang.Exception exception generated
    */
    @Before
    public void setUp() throws Exception {
        this.power = new Power(2, 3);
    }

    /**
     * Method called after each method containing a test
    * @throws java.lang.Exception exception generated
    */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link com.akicalculator.models.Power#apply()}
     */
    @Test
    public void testApply() {
        final float result = this.power.apply();

        Assert.assertEquals(8.0f, result, 0.0f);
    }

}
