package com.purushoth.day_10;

public class Boxing {

	public static void main(String[] args) {
		int a=10;
		
		Integer obj1=new Integer(a); //Boxing
		int b=obj1.intValue(); //Un-Boxing
		
		//JDK 1.5
		Integer obj2=a; //Auto-Boxing
		int c=obj2;  //Auto-UnBoxing

	}

}