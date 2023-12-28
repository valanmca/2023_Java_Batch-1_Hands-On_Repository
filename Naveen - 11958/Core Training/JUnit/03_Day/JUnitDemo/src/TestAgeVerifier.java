import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAgeVerifier {

	@Test
	public void testAgeValid() throws InValidAgeException, AgeOverException{
		AgeVerifier a = new AgeVerifier();
		assertEquals("Age Verified",a.VerifyAge(25));
	}
	
	@Test
	public void testAgeInValid() throws InValidAgeException, AgeOverException {
		AgeVerifier a = new AgeVerifier();
		try {
		assertEquals("Invalid Age", a.VerifyAge(11));
		}
		catch(Exception e) {
			
		}
	}
	
	@Test
	public void testAgeOver() throws InValidAgeException, AgeOverException {
		AgeVerifier a = new AgeVerifier();
		try {
		assertEquals("Age is Over", a.VerifyAge(65));
		}
		catch(Exception e) {
			
		}
	}
	
	@Test
	public void testAgeOver1() throws InValidAgeException, AgeOverException{
		AgeVerifier a = new AgeVerifier();
		try {
		assertEquals("", a.VerifyAge(66));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
