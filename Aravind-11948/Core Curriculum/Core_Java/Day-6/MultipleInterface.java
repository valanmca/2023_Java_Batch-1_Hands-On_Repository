package com.core.day_06;

interface One{
	
	void addition(int a,int b);
}

interface Two{
	void subtraction(int a,int b);
}

//interface Three extends  One,Two { //Multiple inheritance 
//	
//	 void multiplication(int a ,int b);
//}

class Calculator implements One,Two{
	public void addition(int a,int b) {
		System.out.println("Addition of " +a +"+"+b+"="+(a+b));
	}
	
	public void subtraction(int a,int b) {
		System.out.println("Subtraction "+a +"-"+b+"="+(a-b));
	}
}


public class MultipleInterface {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.addition(40, 50);
		obj.subtraction(40, 10);
				

	}

}
