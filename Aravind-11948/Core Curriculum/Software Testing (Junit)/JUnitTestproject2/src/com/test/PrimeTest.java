package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.prime.Prime;

@RunWith(Parameterized.class)

public class PrimeTest {
	static Prime prime;
	private int inputNumber;
	  private boolean expectedNumber;
	
	
	

	@BeforeClass
	public static void objectCreation() {
		prime = new Prime();
	}

	@AfterClass
	public static void objectDeletion() {
		prime = null;
	}

//	@Before
//	public void initialization() {
//		num1 = 13;
//		
//	}
//	
//	@After
//	public void reset() {
//		num1 = 0;
//		
//	}
	
	public PrimeTest(int inputNumber,boolean expectedNumber )
	{
		this.inputNumber=inputNumber;
		this.expectedNumber=expectedNumber;
	}
	
	@Parameterized.Parameters
	 public static Collection primeNumber() {
		 return Arrays.asList(new Object[][] { { 2, true }, { 6, false }, { 19, true }, { 22, false }, { 23, true } });
	}
	
	
	
	
	

	@Test
	public void testPrime() {
		boolean actual=prime.isPrime(inputNumber);
		assertEquals(expectedNumber, actual);

	}
	


}
