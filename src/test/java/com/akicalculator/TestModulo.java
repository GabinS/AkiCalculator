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
     * Method called before each method containing a test
    * @throws java.lang.Exception exception generated
    */
    @Before
    public void setUp() throws Exception {
        this.modulo = new Modulo(10, 3);
    }

    /**
     * Method called after each method containing a test
    * @throws java.lang.Exception exception generated
    */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link com.akicalculator.models.Modulo#apply()}
     */
    @Test
    public void testApply() {
        final float result = this.modulo.apply();

        Assert.assertEquals(1.0f, result, 0.0f);
    }

}
