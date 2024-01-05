package com.shiva;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test_add1() {

		Calculator cal = new Calculator();
		int result = cal.add(10, 5);
		assertEquals(15, result);
	}

	@Test
	public void test_add2() {
		Calculator cal = new Calculator();
//		int result = cal.add(-10, 5);
		assertEquals(-5, cal.add(-10, 5));
	}

	@Test
	public void test_multiply1() {
		Calculator cal = new Calculator();
		assertEquals(15, cal.multiply(3, 5));
	}

	@Test
	public void test_multiply2() {
		Calculator cal = new Calculator();
		assertEquals(5, cal.multiply(1, 5));
	}

	@Test
	public void test_divide() {
		Calculator cal = new Calculator();

		try {
			assertEquals(0, cal.divide(4, 0));
		} catch (Exception e) {
			fail("Invalid");
		}
	}
}
