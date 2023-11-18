package com.jeyandhan.day06;

class A1{
	String msg = myMethod();
	
	String myMethod() {
		return "A";
	}
}

class B1 extends A1{
	
	String myMethod() {
		return "B";
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		A1 obj = new B1();
		System.out.println(obj.msg);

	}

}
