package com.purushoth.day_04;

class A5{
	String msg=myMethod();
	String myMethod() {
		return "A";
	}
}

class B5 extends A5{
	String myMethod() {
		return "B";
}
}

	public class MethodOverriding2 {

	public static void main(String[] args) {
		A5 obj=new B5();
		System.out.println(obj.msg);//o/p is B because it is overriding for the object.
       
	}

}
