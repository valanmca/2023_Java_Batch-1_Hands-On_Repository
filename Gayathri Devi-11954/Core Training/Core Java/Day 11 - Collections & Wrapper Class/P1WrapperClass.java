package com.gayathri.day11CollectionandWrapperclass;

public class P1WrapperClass {

	public static void main(String[] args) {
		int a = 10; //primitive type
		
		Integer obj1 = new Integer(a); //Boxing
		int b = obj1.intValue(); //Un-Boxing
		
		//jdk1.5
		Integer obj2 = a; //auto-boxing
		int c = obj2; //auto-un-boxing
	}

}
