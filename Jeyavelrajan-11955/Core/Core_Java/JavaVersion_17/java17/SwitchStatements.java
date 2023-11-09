package com.jeyavel.core.java17;

public class SwitchStatements {

	public static void main(String[] args) {
		String day = "Monday";
		String result="";
		result=switch(day) {
		case"Saturday","Sunday"->"Weekend";
		case"Monday","Tuesday" -> "weekday";
		default->"Invalid";
		
		};
		System.out.println(result);

	}

}
