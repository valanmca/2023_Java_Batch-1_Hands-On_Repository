package com.jeban.OOPsday7;

abstract class myAbstractclass {
	myAbstractclass(int a){
		System.out.println("Constructor");
	}


	abstract void Mymethod1();

	abstract void Mymethod2();

	void Mymethod3() {
		System.out.println("My Concreate class");
	}
}

class NormalClas1 extends myAbstractclass {
	
	NormalClas1(){
		super(3);
	}


	void Mymethod1() {
		System.out.println("My Abstractclass-1");
	}

	void Mymethod2() {
		System.out.println("My Abstract class-2");

	}
}

public class Abstractpractice1 {

	public static void main(String[] args) {
		myAbstractclass obj = new NormalClas1();// DMD
		obj.Mymethod1();
		obj.Mymethod2();
		obj.Mymethod3();

	}

}
