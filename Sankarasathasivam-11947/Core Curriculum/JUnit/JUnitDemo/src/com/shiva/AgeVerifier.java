package com.shiva;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

class AgeOverException extends Exception {
	public AgeOverException(String str) {
		super(str);
	}
}

public class AgeVerifier {

	public String verifyAge(int age) throws InvalidAgeException, AgeOverException {

		String result = null;
		if (age >= 18 && age <= 60) {
			result = "Age Verified";
			return result;
		}
		if (age < 18) {
			throw new InvalidAgeException("Invalid Age");
		}

		if (age > 60) {
			throw new AgeOverException("Age is Over");
		}
		return result;
	}
}
