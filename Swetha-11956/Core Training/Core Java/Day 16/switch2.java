package com.swetha.features;

public class switch2 {
//
	public static void main(String[] args) {

		String day="Monday";
		String result="";
		result=switch(day) {
		case "Saturday","Sunday"-> "weekend";
		case "Monday","Tuesday" -> "weekday";
		default-> "Invalid"; 	
		};
		System.out.println(result);
	}

}
