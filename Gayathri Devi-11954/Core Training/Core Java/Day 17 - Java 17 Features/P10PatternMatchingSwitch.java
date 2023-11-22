package com.gayathri.day17Java17Features;

public class P10PatternMatchingSwitch {

	public static void main(String[] args) {

		String day = "Monday";
		String result = "";
		result = switch (day) 
		{
			case "Saturday", "Sunday" -> "Weekends";
			case "Monday", "Tuesday" -> "Weekdays";
			default -> "Invalid";
		};
		System.out.println(result);
	}

}
