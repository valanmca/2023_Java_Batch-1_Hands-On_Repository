package Calculator;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestAgeVerifier {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCase1() {
		
			AgeVerifier mc = new AgeVerifier();
			try {
			int age=mc.verifyAge(21);
			assertEquals(21,age);
			}catch(Exception e)
			{
				fail("Age Verfied");
			}
		}
	
	@Test
	public void testCase2() {
		
			AgeVerifier mc = new AgeVerifier();
			try {
			int age=mc.verifyAge(11);
			assertEquals(11,age);
			}catch(Exception e)
			{
				//TODO : Handle Exception
				fail("Invalid Age");
			}
		}
	
	@Test
	public void testCase3() {
		
			AgeVerifier mc = new AgeVerifier();
			try {
			int age=mc.verifyAge(65);
			assertEquals(65,age);
			}catch(Exception e)
			{
				//TODO : Handle Exception
				fail("Age is Over");
			}
		}
	
	
	@Test
	public void testCase4() {
		
			AgeVerifier mc = new AgeVerifier();
			try {
			int age=mc.verifyAge(66);
			assertEquals(66,age);
			}catch(Exception e)
			{
				//TODO : Handle Exception
				fail("Exception has to raise,not checking the message");
			}
		}
	
	}
