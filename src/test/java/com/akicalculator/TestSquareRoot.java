package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.SquareRoot;

/**
 * @author Joris Guerrier
 *
 */
public class TestSquareRoot {

    private SquareRoot square;

    /**
     * Method called before each method containing a test
     * @throws java.lang.Exception exception generated
     */
    @Before
    public void setUp() throws Exception {
        this.square = new SquareRoot(9);
    }

    /**
     * Method called after each method containing a test
     * @throws java.lang.Exception exception generated
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link com.akicalculator.models.SquareRoot#apply()}.
     */
    @Test
    public void testApply() {
        final float result = this.square.apply();

        Assert.assertEquals(3.0f, result, 0.0f);
    }
}
