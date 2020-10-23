package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Division;

public class TestDivision {

    private Division division;

    /**
     * Method called before each method containing a test
     * @throws Exception exception generated
     */
    @Before
    public void setUp() throws Exception {
        this.division = new Division(12, 3);
    }

    /**
     * Method called after each method containing a test
     * @throws Exception exception generated
     */
    @After
    public void tearDown() throws Exception {

    }

    /**
     * Test the division by zero.
     */
    @Test
    public void testApplyByZero() {
        Division division = new Division(12, 0);
        final float result = division.apply();

        Assert.assertEquals(0.0f, result, 0.0f);
    }

    /**
     * Test method for {@link com.akicalculator.models.Division#apply()}
     */
    @Test
    public void testApply() {
        final float result = this.division.apply();

        Assert.assertEquals(4.0f, result, 0.0f);
    }

}
