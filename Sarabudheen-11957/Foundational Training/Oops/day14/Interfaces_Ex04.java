/******** Multiple Inheritance Using Interfaces... **********/
package com.sara.day14;

interface One {
	int a = 10;// Public Static Final
}

interface Two {
	int a = 20;// Public Static Final
}

interface Three extends One, Two {// Multiple Inheritance
	void addition();// Public abstract

}

class Calculator3 implements Three {
	public void addition() {
		System.out.println("Addition : " + (One.a + Two.a));
	}
}

public class Interfaces_Ex04 {

	public static void main(String[] args) {
		Calculator3 obj = new Calculator3();
		obj.addition();

	}

}
