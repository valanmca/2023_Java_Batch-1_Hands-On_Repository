package com.gayathri.day6;
interface One {
	void Addition(int a, int b);	//public static final
}
interface Two {
	void Subtraction(int a, int b);
}
class Calculator implements One, Two{
	public void Addition(int a, int b) {
		System.out.println("Addition : "+(a+b));
	}
	public void Subtraction(int a, int b) {
		System.out.println("Subtraction : "+(a-b));
	}
}
public class ExInterface2 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.Addition(5, 5);
		c.Subtraction(12,5);
	}

}
