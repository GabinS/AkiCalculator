package com.akicalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Operation;

/**
 * TestOperation
 */
public class TestOperation {

    private Operation operation;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.operation = new Operation(3, 4, "+");
    }

    /**
     * Test method for {@link com.akicalculator.models.Operation#apply()}.
     */
    @Test
    public void testApply() {
        final float result = this.operation.apply();
        Assert.assertEquals(0.0f, result, 0.0f);
    }

}
