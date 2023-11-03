package com.naveen.day4;

class A3{
	String msg = myMethod();
	
	String myMethod() {
		return "A";
	}
}

class B3 extends A3{
	String myMethod() {
		return "B";
	}
}
public class Ex04 {

	public static void main(String[] args) {
		A3 obj = new B3();
		System.out.println(obj.msg);

	}

}
