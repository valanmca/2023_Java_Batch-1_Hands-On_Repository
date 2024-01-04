package com.junit;

public class TitleMaker {
	public String makeTitle1(String input) {
		{
			if (input == null || input.length() == 0)
				return input;
			return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
		}
	}

}
