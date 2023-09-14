package com.jenish.day11;
class SuperClass {
	int a;
	
	SuperClass(int a){
		this.a = a;
	}
	void display() {
		System.out.println("Values of A : " +a);
	}
}
class SubClass extends SuperClass {
	SubClass() {
		super(10);
		super.display();
		System.out.println("Values of a : " +super.a);
	}
}
public class Polymorphism_OverRiding_Ex2 {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		
	}

}
