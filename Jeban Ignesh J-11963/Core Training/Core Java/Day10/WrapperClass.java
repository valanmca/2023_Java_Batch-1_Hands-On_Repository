package com.jeban.Day10;

public class WrapperClass {

	public static void main(String[] args) {
		int a=10;//Primitive
		
		Integer obj1=new Integer(a);//Boxing
		int b=obj1.intValue();//UnBoxing
		
		//JDK 1.5
		Integer obj2=a;//Auto Boxing
		int c=obj2;//Auto UnBoxing
		
		
		
				
	

	}

}
