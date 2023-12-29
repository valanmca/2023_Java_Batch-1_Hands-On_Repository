package com.junit;

public class TitleMaker {

	public String makeTitle(String Input) {
		{  
			if (Input == null || Input.length() == 0) return Input;  
			return Input.substring(0, 1).toUpperCase() + Input.substring(1).toLowerCase();  
			}  
	}
	
}
