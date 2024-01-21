package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.calc.Factorial;

public class FactorialTest {

	static Factorial fact;
	int n;

	@BeforeClass
	public static void objectCreation() {
		fact=new Factorial();
	}
	
	@AfterClass
	public static void odjectDeletion() {
		fact=null;
	}
	
	@Before
	public void Initialization() {
		n=5;
	}
	
	@After
	public void Reset() {
		n=0;	
	}
	
	@Test
	public void test() {
		
		//Factorial fact= new Factorial();
		int actual= fact.Fact(5);
		int expected=120;
		assertEquals(expected, actual);
	}

}
