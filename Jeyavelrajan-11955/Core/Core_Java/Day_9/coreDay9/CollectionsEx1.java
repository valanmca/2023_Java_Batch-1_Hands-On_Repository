package com.jeyavel.coreDay9;
//Boxing and Un-boxing
public class CollectionsEx1 {

	public static void main(String[] args) {
		int a =10;
		
		Integer obj1 = new Integer(a);//Boxing
		int b = obj1.intValue();//Un-Boxing
		
		//JDK1.5
		Integer obj2 = a;//Auto-Boxing
		int c = obj2; 
		

	}

}
