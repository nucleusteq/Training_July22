package test.com.in.nucleusTeq.junit;

import com.in.nucleusTeq.junit.Addition;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestAddition {
	
	protected Integer value;
	protected Addition addvalue ;
	
	
	@Before
	public void setUp() {
	value=10 ;
	addvalue = new Addition ();
	System.out.println("Result: "+addvalue.add(value));

	}
	
@Test
public void testaddvalue() {
	assertEquals("55",addvalue.add(value));
}
@Test
public void testsubtractvalue() {
	value = -8;
	assertEquals("Not a valid input",addvalue.add(value));
}
@Test 
public void testnotanullvalue() {
	value=null;
	assertEquals("Number cannot be null",addvalue.add(value));
}

@After
public void tearDown()throws Exception{
	addvalue=null;
	System.out.println("after");
}
@AfterClass
public static void tearDownAfterClass() throws Exception{
	System.out.println("after class");
}
	
}

