package com.naveen.day_15;

public class Ex10_Switch {

	public static void main(String[] args) {
		String day="Sunday";
		String result="";
		result=switch(day) {
		case "Saturday","Sunday"-> "weekend";
		case "Monday","Tuesday" -> "weekday";
		default-> "Invalid"; 	
		};
		System.out.println(result);
	}

}
