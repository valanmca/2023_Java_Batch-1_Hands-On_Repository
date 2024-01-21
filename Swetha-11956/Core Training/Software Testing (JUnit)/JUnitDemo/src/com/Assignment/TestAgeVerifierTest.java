package com.Assignment;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.swetha.MyCalculator;

public class TestAgeVerifierTest {

	@Test
	public void test_age1() {

		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("Age Verified", av.verifyAge(21));
		} 
		catch (AgeOverException e) {
			e.printStackTrace();
		}
		catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_age2() {

		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("Invalid Age", av.verifyAge(11));
		} 
		catch (AgeOverException e) {
			e.printStackTrace();
		}
		catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
	

	
	
	@Test
	public void test_age3() {

		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("Age is Over", av.verifyAge(65));
		}
		catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		catch (AgeOverException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test_age4() {

		AgeVerifier av = new AgeVerifier();
		try {
			assertEquals("", av.verifyAge(66));
		} 
		catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		catch (AgeOverException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
            fail("Invalid Age");
        }
	}
	
}
