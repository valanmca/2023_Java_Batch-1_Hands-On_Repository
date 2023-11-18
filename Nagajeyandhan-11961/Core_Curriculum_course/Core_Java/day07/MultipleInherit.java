package com.jeyandhan.day07;

// multiple inheritance

interface One1{
	int a = 10; //public, static, final
}

interface Two1{
	int b = 20; //public, static, final
}

interface Three extends One1, Two1{ // multiple inheritance
	void sum();
}

class Calculator implements Three{
	public void sum() {
		System.out.println(a+b);
	}
}

public class MultipleInherit {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.sum();
	}

}
