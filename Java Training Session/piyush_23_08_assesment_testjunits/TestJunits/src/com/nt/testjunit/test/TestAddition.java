package com.nt.testjunit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.nt.testjunit.Addition;

public class TestAddition {
	Integer val1;
	Addition add;
	
//	@BeforeClass
//	public void setUpBeforeClass() throws Exception {
//		System.out.println("before class");
//	}
	@Before
	public void setUp() {
		val1=4;
		add=new Addition();
		System.out.println(add.sumOfNatural(val1));
	}
	@Test
	public void test() {
		val1=4;
		assertEquals("10",add.sumOfNatural(val1));		
	}
	@Test
	public void testNegative() {
		val1 = -4;
		assertEquals("value is negative",add.sumOfNatural(val1));	
	}
	@Test
	public void testNull() {
		val1 = null;
		assertEquals("value is null",add.sumOfNatural(val1));	
	}


}
