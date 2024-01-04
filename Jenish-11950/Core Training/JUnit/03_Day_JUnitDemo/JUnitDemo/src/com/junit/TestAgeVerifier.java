package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAgeVerifier {

	@Test
	public void testAgeVerified1() {
		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("Age Verified", av.verifyAge(21));
		} catch (Exception e) {
			
		}
	}

	@Test
	public void testAgeVerified2() {
		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("Invalid Age", av.verifyAge(11));
		} catch (Exception e) {
			
		}
	}

	@Test
	public void testAgeVerified3() {
		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("Age is Over", av.verifyAge(65));
		} catch (Exception e) {
			
		}
	}

	@Test
	public void testAgeVerified4() throws InvalidAgeException, AgeOverException {

		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("", av.verifyAge(66));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
