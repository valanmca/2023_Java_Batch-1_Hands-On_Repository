package com.aravind.day14;

interface One {
	int a = 10;
	int c = 30;// default-public,static,final
}

interface Two {
	int a = 20;
	int b = 20;

}

interface Three extends One, Two {
	public void addition();// default-public abstract
}

class Add implements Three {
	public void addition() {
		System.out.println("Addition =" + (One.a + Two.a));// because of ambiguity we ue static a so we call that using
		System.out.println("Addition of no ambiguity value "+(c+b));													// class name
	}
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Add obj=new Add();
		obj.addition();

	}

}
