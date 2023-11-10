package com.madhan.java17;

public class SwitchSinceJava12 {

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


