package com.sara.CoreJava.Day_06;

class A{
//	A(){
//		System.out.println("A");
//	}
//	
//	A(int a){
//		System.out.println("A 1");
//	}
//}

	/**************************/
//	int a = 10;
//	static void display() {
//		System.out.println("A");
//	}
//	}
	
	/**************************/
	
	String msg = myMethod();
	
	String myMethod() {
		return "A";
	}
}
class B extends A{
//	B(){
//		super(5);
//		System.out.println("B");
//	}
//	
//	B(int a){
//		this();
//		System.out.println("B 1");
//	}
//}
	/**************************/

//	int a = 20;
//	static void diaplay() {
//		System.out.println("B");
//	}
//	}

/**************************/
	
	String myMethod() {
		return "B";
	}
}
public class Inheritance_Example01 {

	public static void main(String[] args) {
//		B obj = new B();
//		System.out.println(" ");
//		B obj2 = new B(5);
		
		/**************************/
		
//		A obj = new B();
//		obj.display();
//		System.out.println(obj.a);
//		
		/**************************/
		
		A obj = new B();
		System.out.println(obj.msg);
	}
}
