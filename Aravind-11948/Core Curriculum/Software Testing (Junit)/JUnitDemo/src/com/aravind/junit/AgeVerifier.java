package com.aravind.junit;
//



class InvalidAgeException extends Exception
{
	 public InvalidAgeException (String str)  
	 {
		 super(str);
	 }
}


class AgeOverException extends Exception
{
	 public AgeOverException (String str)  
	 {
		 super(str);
	 }
}

//
public class AgeVerifier {
	
	public String verifyAge(int age) throws InvalidAgeException, AgeOverException {
		
	String r=null;

				if(age>=18 && age<=60)
				{
					r= "Age Verified";
				}
				
				
				
				
				else if(age<18)
				{
					throw new  InvalidAgeException("Invalid Age");
				}
				
				
				else if (age>60)
				{
					throw new AgeOverException("Age is over");
				}
				
		return r;
	}


}
