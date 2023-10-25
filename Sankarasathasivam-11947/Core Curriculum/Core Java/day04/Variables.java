package com.shiva.core.day04;

//Instance Vs Static
public class Variables {
	int a=10;
	
	public static void main(String[] args) {
		Variables obj1=new Variables();
		Variables obj2=new Variables();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}

}
