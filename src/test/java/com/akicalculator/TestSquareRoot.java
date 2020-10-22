/**
 *
 */
package com.akicalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.akicalculator.models.SquareRoot;

/**
 * @author Joris Guerrier
 *
 */
public class TestSquareRoot {

    private SquareRoot square;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.square = new SquareRoot(9);
    }

    /**
     * @throws java.lang.Exception
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
