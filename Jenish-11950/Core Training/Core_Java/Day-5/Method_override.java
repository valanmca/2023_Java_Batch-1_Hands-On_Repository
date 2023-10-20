package com.jenish.day5;


class A3 {
	String msg = myMethod();
	String myMethod() {
		return "A";
	}
}
class B3 extends A3 {
	String myMethod() {
		return "B";
	}
}
public class Method_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 obj = new B3();
		System.out.println(obj.msg);
	}

}
