package com.core.day_15;

public class Switch {

	public static void main(String[] args) {
		 String day="wednesday";
	        switch(day) {
	        case "Saturday","Sunday"->System.out.println("Weekend");
	        case "Monday","Tuesday","wednesday","thursday","friday"->System.out.println("Weekday");
	        default->System.out.println("Invalid");
	        }

	}

}
