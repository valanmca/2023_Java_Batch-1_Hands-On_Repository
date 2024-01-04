package com.junit;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String s) {
		super(s);
	}
}

class AgeOverException extends Exception {
	public AgeOverException(String s) {
		super(s);
	}
}

public class AgeVerifier {
	public String verifyAge(int age) throws InvalidAgeException, AgeOverException {
		if (age >= 18 && age <= 60) {
			return "Age Verified";
		} else if (age < 18) {
			throw new InvalidAgeException("Invalid Age");
		} else {
			throw new AgeOverException("Age is Over");

		}
	}

}
