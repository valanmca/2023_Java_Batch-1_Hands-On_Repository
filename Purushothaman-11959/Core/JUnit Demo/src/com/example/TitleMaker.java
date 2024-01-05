package com.example;

public class TitleMaker {
	
	public String makeTitle(String input)
	{
		
		String t1=input.substring(0,1);
		String t2=t1.toUpperCase();
		String t3=input.substring(1).toLowerCase();
		String t4=t2.concat(t3);
		
		
		return t4;
	}

}
