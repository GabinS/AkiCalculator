/**
 * 
 */
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
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.add = new Addition(3);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

    @Test
    public void testApply() {
    	final float result = this.add.apply(4);

        Assert.assertEquals(7.0f, result, 0.0f);
    }

}
