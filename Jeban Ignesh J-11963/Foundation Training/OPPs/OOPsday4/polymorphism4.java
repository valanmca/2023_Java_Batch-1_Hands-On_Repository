package com.jeban.OOPsday4;

public class polymorphism4 {
	public polymorphism4(String Name, String address) {
//		this(5);
		System.out.println("Name:" + Name);
		System.out.println("Address:" + address);
	}

	public polymorphism4(int n) {
//		this(10,20);
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial:" + fact);
	}

	public polymorphism4(int a, int b) {
		int sum = a + b;
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) {
		polymorphism4 obj = new polymorphism4("Jeban", "PDKT");
		polymorphism4 obj1 = new polymorphism4(5);
		polymorphism4 obj2 = new polymorphism4(10, 30);

	}

}
