import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {

	@Test
	public void test_add1() {
		MyCalculator mc = new MyCalculator();
		int result = mc.add(10, 5);
		assertEquals(15, result);
	}
	
	@Test
	public void test_add2() {
		MyCalculator mc = new MyCalculator();
		assertEquals(-5, mc.add(-10, 5));
	}
	
	@Test
	public void test_multiply1() {
		MyCalculator mc = new MyCalculator();
		assertEquals(15, mc.multiply(3, 5));
	}
	
	@Test
	public void test_multiply2() {
		MyCalculator mc = new MyCalculator();
		assertEquals(5, mc.multiply(1, 5));
	}
	
	@Test
	public void test_div1() {
		MyCalculator mc = new MyCalculator();
		try {
		assertEquals(2, mc.divide(4, 0));
		}
		catch(Exception e) {
			fail("Invalid Division");
		}
	}
	
}
