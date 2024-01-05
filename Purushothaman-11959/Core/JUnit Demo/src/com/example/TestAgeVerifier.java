package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAgeVerifier {

	@Test
	public void test_age1() throws InvalidAgeException, AgeOverException {
		
		AgeVerifier av=new AgeVerifier();
		assertEquals("Age Verified", av.verifyAge(21));
		
	}
	@Test
	public void test_age2() throws InvalidAgeException, AgeOverException {
		
		AgeVerifier av=new AgeVerifier();
		try {
		assertEquals("Invalid Age",av.verifyAge(11));
		} catch(Exception e) {
	
		}
		
	}
	@Test
	public void test_age3() throws InvalidAgeException, AgeOverException {
		
		AgeVerifier av=new AgeVerifier();
		try {
			assertEquals("Age is over",av.verifyAge(65));
		} catch(Exception e) {
			
		}
	}
		@Test
		public void test_age4() throws InvalidAgeException, AgeOverException {
			
			AgeVerifier av=new AgeVerifier();
			try {
				assertEquals("",av.verifyAge(66));
			} catch(Exception e) {
				System.out.println(e);
			}
	
		
	}

}
