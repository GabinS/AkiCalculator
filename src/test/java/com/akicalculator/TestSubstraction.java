package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Substraction;

/***
 * Substraction class test.
 *
 */
public class TestSubstraction {
	
	/**
	 * The substraction to test.
	 */
    private Substraction substract;

    
    /**
     * Init the value to substract.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        this.substract = new Substraction(5);
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Apply the substract command.
     */
	@Test
    public void testApply() {
        final float result = this.substract.apply(3);
        Assert.assertEquals(2.0f, result, 0.0f);

    }

}
