package com.jeban.oops;

class calc{
	//variables
	static float a;
	static float b;
	//constructor
	calc(float a,float b){
		this.a=a;
		this.b=b;
		
	}
	//method
	void addition() {
		System.out.println("Addition:"+(a+b));
		
	}
	static void multiplication() {
		System.out.println("Multiplication:"+(a*b));
		
	}
	void Subtraction() {
		System.out.println("Subtraction:"+(a-b));
		
	}
	static void Division() {
		System.out.println("Division:"+(a/b));
		
	}
	
}

public class Program {

	public static void main(String[] args) {
		calc obj =new calc(20,10);
		obj.addition();
		obj.Subtraction();
		calc.multiplication();
		calc.Division();
		

	}

}
