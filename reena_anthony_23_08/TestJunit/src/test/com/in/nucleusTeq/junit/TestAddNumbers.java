package test.com.in.nucleusTeq.junit;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.in.nucleusTeq.junit.Addition;

public class TestAddNumbers {
	protected Integer num;
	protected Addition addNumbers;
	
	@Before
	public void setUp() {
		num=5;
		addNumbers=new Addition();
		System.out.println("BEFORE\t"+addNumbers.add(num));
	}
	
	@Test
	public void passingPositiveValue(){
		num=4;
		assertEquals("10", addNumbers.add(num));
	}
	
	@Test
	public void passingNegativeValue() {
		num=-10;
		assertEquals("Not a valid input", addNumbers.add(num));
	}
	
	@Test
	public void passingNullValue() {
		num=null;
		assertEquals("Number cannot be null", addNumbers.add(num));
	}
}