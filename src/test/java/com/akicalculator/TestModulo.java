/**
 *
 */
package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Modulo;

/**
 * Modulo test class.
 *
 */
public class TestModulo {

    private Modulo modulo;

    /**
    * @throws java.lang.Exception
    */
    @Before
    public void setUp() throws Exception {
        this.modulo = new Modulo(10, 3);
    }

    /**
    * @throws java.lang.Exception
    */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testApply() {
        final float result = this.modulo.apply();

        Assert.assertEquals(1.0f, result, 0.0f);
    }

}
