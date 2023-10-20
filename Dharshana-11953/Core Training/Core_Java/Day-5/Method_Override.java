package com.dharshu.day5;

class A2{
	String msg = myMethod();
	
	String myMethod() {
		return "A";
	}
}

class B2 extends A2{

	String myMethod() {
		return "B";
	}
}

public class Method_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj = new B2();
		System.out.println(obj.msg);

	}

}
