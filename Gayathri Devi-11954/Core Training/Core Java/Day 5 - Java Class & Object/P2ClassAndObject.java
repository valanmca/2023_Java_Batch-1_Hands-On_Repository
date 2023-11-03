package com.gayathri.day5;

public class P2ClassAndObject {
	P2ClassAndObject() {
		// this(20, 30);
		this(10);
		System.out.println("A");
	}

	P2ClassAndObject(int a) {
		System.out.println("B");
	}

	P2ClassAndObject(int b, int c) {
		System.out.println("C");
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		P2ClassAndObject obj = new P2ClassAndObject();

	}
}
