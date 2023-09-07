package com.purushoth.day9;

public class Instance {

	int a=10; //Instance variable.
	
	public static void main(String[] args) {
	     Instance obj1=new Instance();
	     Instance obj2=new Instance();
	     
	     System.out.println(obj1.a); //10
	     System.out.println(obj2.a); //10
	     
	     obj1.a=20;
	     
	     System.out.println(obj1.a); //20
	     System.out.println(obj2.a); //10


	}

}//Instance
