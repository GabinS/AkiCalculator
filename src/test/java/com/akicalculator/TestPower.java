/**
 *
 */
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
    * @throws java.lang.Exception
    */
    @Before
    public void setUp() throws Exception {
        this.power = new Power(2, 3);
    }

    /**
    * @throws java.lang.Exception
    */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testApply() {
        final float result = this.power.apply();

        Assert.assertEquals(8.0f, result, 0.0f);
    }

}
