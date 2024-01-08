package com.aravind.junit;

import static org.junit.Assert.*;
import org.junit.Test;



public class AgeVerifierTest {

	@Test
	public void test_1() throws InvalidAgeException, AgeOverException {
		
		AgeVerifier age=new AgeVerifier();
		assertEquals("Age Verified",age.verifyAge(21));
		
	}
	
	@Test
	public void test_2() throws InvalidAgeException, AgeOverException {
		
		try {
		
		
		AgeVerifier age=new AgeVerifier();
		assertEquals("Invalid Age",age.verifyAge(11));
		}
		catch(Exception e)
		{
			
		}
	}
		
		@Test
		public void test_3() throws InvalidAgeException, AgeOverException {
			
			try {
				
			
			AgeVerifier age=new AgeVerifier();
			assertEquals("Age is Over",age.verifyAge(65));
			}
			catch(Exception e)
			{
			
			}
		
	}
		
		@Test
		public void test_4() throws InvalidAgeException, AgeOverException {
			
			try {
				
			
			AgeVerifier age=new AgeVerifier();
			assertEquals("",age.verifyAge(66));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
	}
	
	
	
	
		
		
		
		
		


}

