/**
 *
 */
package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.akicalculator.models.Puissance;

/**
 * Power test class.
 */
public class TestPuissance {

    private Puissance puissance;

    /**
    * @throws java.lang.Exception
    */
    @Before
    public void setUp() throws Exception {
        this.puissance = new Puissance(2, 3);
    }

    /**
    * @throws java.lang.Exception
    */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testApply() {
        final float result = this.puissance.apply();

        Assert.assertEquals(8.0f, result, 0.0f);
    }

}
