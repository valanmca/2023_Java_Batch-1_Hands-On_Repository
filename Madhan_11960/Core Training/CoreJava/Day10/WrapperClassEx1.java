package com.madhan.coreday10;

public class WrapperClassEx1 {

	public static void main(String[] args) {
		int a=10; //primitive
		
		
		Integer obj1=new Integer(a); //Boxing
		int b=obj1.intValue(); //Un-Boxing
		
		Integer obj2=a; //Auto-Boxing
		int c=obj2;  //Auto-UnBoxing
	}

}
