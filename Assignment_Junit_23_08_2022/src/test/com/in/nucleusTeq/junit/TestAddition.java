package test.com.in.nucleusTeq.junit;

import com.in.nucleusTeq.junit.Addition;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestAddition {

	protected Integer value;
	protected Addition addvalues;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("before class");
	}
	@Before
	public void setUp() {
		value=7;
		addvalues = new Addition ();
		System.out.println("Result: "+addvalues.add(value));
	}
	@Test
	public void testaddvalues() {
		assertEquals("28",addvalues.add(value));
	}
     @Test
		public void testsubtractvalue() {
			value = -4;
			assertEquals("Not a valid input",addvalues.add(value));
		}
	 @Test
		public void testnotanullvalue() {
			value=null;
			assertEquals("Number cannot be null",addvalues.add(value));
		}
	@After
	public void tearDown()throws Exception{
		addvalues=null;
		System.out.println("after");

	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("after class");
	}
}
