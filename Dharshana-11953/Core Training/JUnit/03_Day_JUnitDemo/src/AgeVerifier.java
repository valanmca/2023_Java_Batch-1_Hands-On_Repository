package com.junit;

 class InvalidAgeException extends Exception{

	public InvalidAgeException(String msg) {
		super(msg);
	}
}

 class AgeOverException extends Exception {

	public AgeOverException (String msg) {
		super(msg);
	}
}
public class AgeVerifier {

	public String verifyAge(int age) throws InvalidAgeException,AgeOverException  {
		
		String r=null;
		if(age>=18 && age<=60) {
			
			r= "Age Verified";
		}
	 if(age<18) {
			throw new InvalidAgeException("InvalidAgeException");
		}
		if(age>60) {
			throw new AgeOverException ("AgeOverException");
		}
		return r;
	}
}
