package com.muthu;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestAgeVerifier {

	@Test
	public void test() {
			AgeVerifier a=new AgeVerifier();
			try{
				assertEquals("Age Verified",a.verifyAge(21));
			
		}catch(InvalidAgeException e) {
			e.printStackTrace();
				}
	catch(AgeOverExeption e) {
		e.printStackTrace();

		}
}



@Test
public void test1() {
		AgeVerifier a=new AgeVerifier();
		try{
			assertEquals("Invaild Age",a.verifyAge(18));
		
	}catch(InvalidAgeException e) {
		e.printStackTrace();
			}
catch(AgeOverExeption e) {
	e.printStackTrace();

	}
}
@Test
public void test2() {
		AgeVerifier a=new AgeVerifier();
		try{
			assertEquals("Age is Over",a.verifyAge(65));
		
	}catch(InvalidAgeException e) {
		e.printStackTrace();
			}
catch(AgeOverExeption e) {
	e.printStackTrace();

	}
}
}



