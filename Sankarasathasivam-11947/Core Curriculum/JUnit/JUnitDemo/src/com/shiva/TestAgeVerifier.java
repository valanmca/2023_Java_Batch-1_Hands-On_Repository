package com.shiva;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAgeVerifier {

	@Test
	public void test_age1() throws InvalidAgeException, AgeOverException {
		AgeVerifier av = new AgeVerifier();
		assertEquals("Age Verified", av.verifyAge(21));
	}

	@Test
	public void test_age2() throws InvalidAgeException, AgeOverException {
		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("Invalid Age", av.verifyAge(11));
		} catch (Exception e) {

//			fail("Invalid Age");
		}

	}

	@Test
	public void test_age3() throws InvalidAgeException, AgeOverException {
		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("Age is Over", av.verifyAge(65));
		} catch (Exception e) {
//			fail("Age is Over");
		}
	}

	@Test
	public void test_age4() throws InvalidAgeException, AgeOverException {
		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("", av.verifyAge(66));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
