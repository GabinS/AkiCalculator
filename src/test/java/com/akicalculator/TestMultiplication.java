package com.akicalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.akicalculator.models.Multiplication;

public class TestMultiplication {

	private Multiplication multi;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		this.multi = new Multiplication(2);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testApply() {
		
	     float result = this.multi.apply(3);
	     
	     Assert.assertEquals(6.0f, result, 0.0f);
	}
	

}
