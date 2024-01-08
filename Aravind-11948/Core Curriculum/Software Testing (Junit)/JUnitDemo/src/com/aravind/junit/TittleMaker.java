package com.aravind.junit;

public class TittleMaker {
	
	public String makeTitle (String input) {
		
		String value=input;
		
		
	String s1=value.substring(0,1).toUpperCase();
	String s2=value.substring(1).toLowerCase();
	String title=s1+s2;
	
	return title;
		
		
	}

}
