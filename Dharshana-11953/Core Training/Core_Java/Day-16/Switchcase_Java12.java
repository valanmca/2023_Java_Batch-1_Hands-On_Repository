package com.dharshu.day16;

public class Switchcase_Java12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="Monday";
		String result="";
		result=switch(day) {
		case "Saturday","Sunday"->"Weekend";
		case "Monday","Tuesday"->"Weekday";
		default->"Invalid";
		};
		System.out.println(result);

	}

}
