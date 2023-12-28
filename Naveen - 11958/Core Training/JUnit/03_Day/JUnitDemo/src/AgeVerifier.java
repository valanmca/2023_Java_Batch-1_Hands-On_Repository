class InValidAgeException extends Exception{
	
	public InValidAgeException(String message) {
		super(message);
	}
}


class AgeOverException extends Exception{
	public AgeOverException(String message) {
		super(message);
	}
}

	
public class AgeVerifier {
	
	public String VerifyAge(int age) throws InValidAgeException, AgeOverException {
		
	
		if(age>=18 && age<=60) {
			return "Age Verified";
		} 
		else if(age<18) {
			throw new InValidAgeException("Invalid Age");
		}
		else {
			throw new AgeOverException("Age is over");
		}
		
	}
		
}
