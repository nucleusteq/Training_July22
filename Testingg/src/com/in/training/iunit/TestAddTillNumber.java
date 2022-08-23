package com.in.training.iunit;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.in.nucleusTeq.jUnit.AddTillNumber;
public class TestAddTillNumber {
protected Integer value;
AddTillNumber addvalues;
@BeforeClass
public static void setUpBeforeClass() throws Exception {
	System.out.println("Before Class");
}
@Before
public void setUp() {
	value=4;
	addvalues = new AddTillNumber();
	System.out.println(addvalues.add(value));
}
@Test
public void test1() {
	assertEquals("10",addvalues.add(value));
}
@Test
public void test2() {
	value=0;
	assertEquals("Value should not be zero",addvalues.add(value));
}
@Test
public void test3() {
	value= -3;
	assertEquals("Value should not be less than 1",addvalues.add(value));
}
@After
public void tearDown() throws Exception{
	addvalues= null;
	System.out.println("After");
}
@AfterClass
public static void tearDownAfterClass() throws Exception{
	System.out.println("After Class");
}
}