//super keyword

package com.jeyandhan.day11;

class SuperClass{ //super class
	int a;
	
	SuperClass(int a){
		this.a = a;
	}
	void display() {
		System.out.println("Value of A : "+ a);
	}
}

class SubClass extends SuperClass{ //sub class
	SubClass(){
		super(10);
		super.display();
		System.out.println("Value of a: "+super.a);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// object creation
		SubClass obj = new SubClass();
	}

}
