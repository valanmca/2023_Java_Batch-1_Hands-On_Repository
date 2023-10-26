package com.gayathri.day5;

class A{
	A(){
		System.out.println("A");
	}
	A(int a){
		System.out.println("A 1");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B");
	}
	B(int a){
		this();
		System.out.println("B 1");
	}
}
public class SuperKeywordEx1 {

	public static void main(String[] args) {
		B obj = new B(5);

	}

}
