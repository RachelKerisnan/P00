import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	
// test normal
	@Test
	public void testAddNormal() {
		//fail("Not yet implemented");
		int a= 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	// test boundary
	@Test
	public void testAddBoundary() {
		//fail("Not yet implemented");
		int a= 99999999;
		int b = 10000000;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	// test error
		@Test
		public void testAddError() {
			//fail("Not yet implemented");
			int a= 99999;
			int b = 0;
			
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			
			int expected= 0 ;
			assertEquals (expected, actual);
		}
	
	
	
	
	// test normal
	@Test
	public void testSubtractNormal() {
		//fail("Not yet implemented");
		int a= 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = -7531;
		assertEquals (expected, actual);
	}
	
	// test boundary
		@Test
		public void testSubtractBoundary() {
			//fail("Not yet implemented");
			int a= -1234;
			int b = -8765;
			
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b);
			
			int expected = 0;
			assertEquals (expected, actual);
		}
		// test error
		@Test
		public void testSubtractError() {
			//fail("Not yet implemented");
			int a= -999999;
			int b = 1;
			
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b);
			
			int expected = -1000000;
			assertEquals (expected, actual);
		}
		
	

	
	// test normal
	@Test
	public void testMultiplyNormal() {
		//fail("Not yet implemented");
		int a= 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = -7531;
		assertEquals (expected, actual);
	}
	
	// test boundary
		@Test
		public void testMultiplyBoundary() {
			//fail("Not yet implemented");
			int a= 0;
			int b = -8765;
			
			Calculator cal = new Calculator();
			int actual = cal.multiply(a, b);
			
			int expected = 0;
			assertEquals (expected, actual);
		}
		
		// test Error
		@Test
		public void testMultiplyError() {
			//fail("Not yet implemented");
			int a= 999999;
			int b = 0;
			
			Calculator cal = new Calculator();
			int actual = cal.multiply(a, b);
			
			 int expected  = 0;
			assertEquals (expected, actual);
		}
		
	
	
	
	
	// test normal
	@Test
	public void testDivideNormal() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 3;
		assertEquals (expected, actual);
		}

	// test boundary
		@Test
		public void testDivideBoundary() {
			int a = 9999;
			int b = 33;
				
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b); 
				 
			int expected = 303;
			assertEquals (expected, actual);
			}

		// test error
		@Test
		public void testDivideError() {
			int a = 0;
			int b = -99999;
				
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b); 
				 
			int expected = 0;
			assertEquals (expected, actual);
			}


}
