package com.Assignment;

 class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String msg) {
		super(msg);
	}	
}
class AgeOverException extends Exception{
	 
	public AgeOverException(String msg) {
		super(msg);
	}
}

public class AgeVerifier {
	
	public String verifyAge(int age) throws InvalidAgeException,AgeOverException {
		
		if(age>=18 && age<=60) {
			return "Age Verified";
		}
		if(age<18) {
			throw new InvalidAgeException ("Invalid Age");
		}
		if (age>60) {
			throw new AgeOverException ("Age is Over");
		}
		return "Wrong Age";
	}

	
	
	}

