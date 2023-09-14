package com.matthew.day12;

class Addition{
	
	void add(int a, int b) {
		System.out.println("int : "+a+b);
	}
	
	void add(float a, float b) {
		System.out.println("float : "+a+b);
	}
	
	void add(double a, double b) {
		System.out.println("double : "+a+b);
	}
}
public class Program2 {

	public static void main(String[] args) {
		Addition sum = new Addition();
		sum.add(10, 20);
		sum.add(45.1f, 23.84f);
		sum.add(23.56, 44.11);
	}
}