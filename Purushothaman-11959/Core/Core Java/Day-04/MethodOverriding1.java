package com.purushoth.day_04;

class A4{
	int a=10;
	static void display() {
		System.out.println("A");
		}
}

class B4 extends A4{
	int a=20;
	static void display() {
		System.out.println("B");
	}
}
public class MethodOverriding1 {

	public static void main(String[] args) {
		A4 obj=new B4();//Dynamic Dispatch Method
		obj.display();
		System.out.println(obj.a);//Variable can't override
		B4 obj1=new B4();
		System.out.println(obj1.a);//To display (B4) value

	}

}
