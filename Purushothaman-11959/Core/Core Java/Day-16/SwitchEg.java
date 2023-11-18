package com.purushoth.day_16;

public class SwitchEg {

	public static void main(String[] args) {
		String day="Monday";
		switch(day) {
		case "Saturday","Sunday"->System.out.println("Weekend");
		case "Monday","Tuesday"->System.out.println("Weekday");
		default->System.out.println("Invalid");
		}

	}

}
