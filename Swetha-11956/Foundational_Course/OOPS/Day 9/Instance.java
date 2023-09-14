package com.swetha.day9;

//Instance Vs Static
public class Instance {
	int a=10;

	public static void main(String[] args) {
		Instance obj1=new Instance();
		Instance obj2=new Instance();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;    //Changing the obj1 value from 10 to 20
		System.out.println(obj1.a);
		System.out.println(obj2.a);

	}

}
