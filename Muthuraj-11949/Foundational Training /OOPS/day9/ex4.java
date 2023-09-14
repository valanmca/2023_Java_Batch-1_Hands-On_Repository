package com.muthu.day9;

public class ex4 {
	 int a=10;
	 static int b=4;
	public static void main(String[] args) {
		ex4 obj1=new ex4();
		ex4 obj2=new ex4();
		System.out.println(ex4.b);
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		obj1.a=1;
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10
	

	}

}
