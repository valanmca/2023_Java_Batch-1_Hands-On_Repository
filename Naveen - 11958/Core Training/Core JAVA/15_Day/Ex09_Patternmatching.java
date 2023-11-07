package com.naveen.day_15;

public class Ex09_Patternmatching {

	public static void main(String[] args) {
		String obj = "Naveenraj Karthikeyan";
		
		System.out.println(obj.length());
		
		if(obj instanceof String) {
			String str = (String) obj;
			System.out.println(str.length());
		}
		
		if(obj instanceof String str) {
			System.out.println(str.length());
		}
	}

}
