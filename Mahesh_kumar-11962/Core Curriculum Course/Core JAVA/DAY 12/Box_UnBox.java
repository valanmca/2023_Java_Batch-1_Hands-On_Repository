package com.mahesh.core_java_day_12;

public class Box_UnBox {

	public static void main(String[] args) {
		
		Integer a = 289;
		Integer ob = new Integer(a);//Boxing
		int b = ob.intValue();//Un Boxing
		
		//jdk 1.5
		Integer obj = a;//Auto Boxing
		int c = obj;//Auto UnBoxing
		

	}

}
