package com.shiva.core.day05;

class One{
	int a=10;
	static void display() {
		System.out.println("A");
	}
}

class Two extends One{
	int a=20;
	static void display() {
		System.out.println("B");
	}
}
public class Override2 {

	public static void main(String[] args) {
		One obj=new Two();
		obj.display();
		System.out.println(obj.a);

	}

}
