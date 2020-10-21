package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.Division;

public class TestDivision {

	private Division division;

	@Before
	public void setUp() throws Exception {
		this.division = new Division(12);
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testApplyByZero() {		
	     float result = this.division.apply(0);
	     
	     Assert.assertEquals(12.0f, result, 0.0f);
	}

	@Test
	public void testApply() {
		
	     float result = this.division.apply(3);
	     
	     Assert.assertEquals(4.0f, result, 0.0f);
	}
	

}
