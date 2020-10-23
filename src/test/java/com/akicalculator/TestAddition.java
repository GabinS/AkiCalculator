package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Addition;

/**
 * @author gabz9
 *
 */
public class TestAddition {

    private Addition add;

    /**
     * Method called before each method containing a test
     * @throws java.lang.Exception Exception generated
     */
    @Before
    public void setUp() throws Exception {
        this.add = new Addition(3, 4);
    }

    /**
     * Method called after each method containing a test
     * @throws java.lang.Exception Exception generated
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link com.akicalculator.models.Addition#apply()}
     */
    @Test
    public void testApply() {
        final float result = this.add.apply();

        Assert.assertEquals(7.0f, result, 0.0f);
    }

}
