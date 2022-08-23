package test.nt.testunit;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.nt.testunit.AddIntegers;

public class AddIntegersTestCases {
	
	Integer inputval;
	AddIntegers mainObject;
	
	@Before
	public void initialize(){
		inputval = 3;
		mainObject = new AddIntegers();
	}
	
	@Test
	public void correctValues() {
		inputval = 3;
		assertEquals("6",mainObject.addIntegers(inputval));
	}
	
	@Test
	public void correctNegativeValues() {
		inputval = -3;
		assertEquals("Enter postitve only!",mainObject.addIntegers(inputval));
	}
	
	@Test
	public void correctNullValues() {
		inputval = null;
		assertEquals("Cant be null",mainObject.addIntegers(inputval));
	}
	
	@Test
	public void correctRangeValues() {
		inputval = 5001;
		assertEquals("Out of Range",mainObject.addIntegers(inputval));
	}
}
