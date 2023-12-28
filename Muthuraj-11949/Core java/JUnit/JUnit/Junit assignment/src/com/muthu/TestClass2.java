package com.muthu;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before SETUP");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After SETUP");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before  TestCASE");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After  TestCASE");

	}

	@Test
	public void test1() {

	assertTrue(true);
	}
	@Test
	public void test2() {

	assertTrue(true);
	}
}
