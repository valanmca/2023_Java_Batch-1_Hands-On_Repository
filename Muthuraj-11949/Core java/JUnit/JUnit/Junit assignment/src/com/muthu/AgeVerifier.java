package com.muthu;
  class InvalidAgeException extends Exception{
	  public InvalidAgeException(String msg1) {
	super(msg1);}
	
}
  class AgeOverExeption  extends Exception{
	  public AgeOverExeption(String msg2) {

	super(msg2);	}
}
public  class AgeVerifier {
	
	public  String verifyAge(int age) throws   InvalidAgeException ,   AgeOverExeption {
			
	if(age >=18 & age<=60) {
		return "Age Verified";		
	}
	if(age<18 ) {
		throw new InvalidAgeException("Invaild Age");
	}
if(age<60 ){
	throw new AgeOverExeption(" Age Over");
	}
	return "Invaild age";
}}
