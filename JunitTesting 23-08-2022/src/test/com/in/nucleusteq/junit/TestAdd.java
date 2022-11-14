package test.com.in.nucleusteq.junit;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;

import test.com.in.nucleusteq.addition.Addition;  

//import org.junit.jupiter.api.Test;

public class TestAdd {

	Addition addition;
	Integer value;
	
	@Before
	public void setUp() {
		value=4;
		addition = new Addition();
		
		System.out.println("Before the run pgm");
	}
	@org.junit.Test
	public void Test() {
		value=4;
		assertEquals("10",addition.natural(value));
		
	}
	@org.junit.Test
	public void TestNegative() {
		value=-4;
		assertEquals("value is negative",addition.natural(value));
		
	}
	@org.junit.Test
	public void TestNull() {
		value=null;
		assertEquals("value is null",addition.natural(value));
		
	}
	
//    @AfterClass
//    public int add(int add,int add1){
//    return add+add1;
//}
	
	


	 
	        
}
