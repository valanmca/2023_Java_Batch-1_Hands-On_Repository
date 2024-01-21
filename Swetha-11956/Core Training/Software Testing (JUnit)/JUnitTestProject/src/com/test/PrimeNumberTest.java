package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.prime.PrimeNumber;

@RunWith(Parameterized.class)

public class PrimeNumberTest {

	static PrimeNumber prime;
	
	private int inputNumber;
	private boolean expectedResult;

	@BeforeClass
	public static void objectCreation() {
		prime = new PrimeNumber();
	}

	@AfterClass
	public static void objectDeletion() {
		prime = null;
	}

	//Constructor
	public PrimeNumberTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { 2, true }, { 6, false }, { 19, true }, { 22, false }, { 23, true } });
	}

//	@Before
//	public void initialization() {
//		n=7;
//	}

//	@After
//	public void reset() {
//		n=0;
//	}

	
	@Test
	public void testIsPrime() {

		boolean actual = prime.isPrime(inputNumber);
		assertEquals(expectedResult, actual);
	}

}
