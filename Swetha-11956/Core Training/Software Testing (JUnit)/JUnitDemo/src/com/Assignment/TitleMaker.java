package com.Assignment;

public class TitleMaker {
	
	public String makeTitle(String input) {
		
		String cap=input.substring(0, 1).toUpperCase() +input.substring(1).toLowerCase();
		return cap;
	}

}
