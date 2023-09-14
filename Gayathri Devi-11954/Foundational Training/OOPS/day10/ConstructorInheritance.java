package com.gayathri.day10;
//multilevel inheritance using Constructor only
class BaseClass {
	BaseClass() {
		System.out.println("Constructor of Base Class");
	}
}

class SubClass extends BaseClass {
	SubClass() {
		System.out.println("Constructor of Sub Class");
	}
}

class FinalSubClass extends SubClass {
	FinalSubClass() {
		System.out.println("Constructor of Final Sub Class");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		FinalSubClass object = new FinalSubClass();

	}
}
