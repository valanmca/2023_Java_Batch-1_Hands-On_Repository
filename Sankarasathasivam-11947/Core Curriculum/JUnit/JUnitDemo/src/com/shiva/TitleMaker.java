package com.shiva;

public class TitleMaker {

	public String makeTitle(String input) {
//		String input1;
		return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
	}
}
