package com.muthu.day9;

public class ex5 {
	static int a=10;
public static void main(String[] args) {
	ex5 obj1 = new ex5();
	ex5 obj2=new ex5();
	
	System.out.println(obj1.a);//10
	System.out.println(obj2.a);//10
	obj1.a=20;
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10
	

	

}

}

