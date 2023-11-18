package com.jeyandhan.day07;
//interface
interface One{
	void addition(int a, int b);
}

interface Two{
	void subtraction(int a, int b);
}

class Calculate implements One, Two{
	public void addition(int a, int b) {
		 System.out.println("Addition: "+ (a+b));
	 }
	
	public void subtraction(int a, int b) {
		 System.out.println("Subtraction: "+ (a-b));
	 }
}

public class Interfaces {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		
		calc.addition(10, 20);
		calc.subtraction(10, 20);

	}

}
