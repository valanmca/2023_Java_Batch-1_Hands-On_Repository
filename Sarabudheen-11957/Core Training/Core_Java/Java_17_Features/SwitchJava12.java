//
package com.sara.CoreJava.Day_17;

public class SwitchJava12 {

	public static void main(String[] args) {
		
		String day = "Monday";
		String result = "";
		result = switch(day) {
		
		case "Saturday","Sunday" -> "Weekend";
		case "Monday","Tuesday" -> "Weekdays";
		default -> "Invalid";
		};
		
		System.out.println(result);
	}

}
