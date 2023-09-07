package com.matthew.day14;



interface MyInterface3{
	void addition(int a,int b);
	void subtraction(int a,int b);
}

interface MyInterface4 extends MyInterface3{
	void multiplication(int a,int b);
	void divition(int a,int b);
}

//we extends Interface 4 from 3 so implements only MiInterface4 is enough 
class Caculator5 implements MyInterface4{
	public void addition(int a,int b) {
		System.out.println("Addition of two number : "+(a+b));
	}
	
	public void subtraction(int a,int b) {
		System.out.println("Subtraction of two number : "+(a-b));
	}
	
	public void multiplication(int a,int b) {
		System.out.println("Multiplication of two number : "+(a*b));
	}
	
	public void divition(int a,int b) {
		System.out.println("Divition of two number : "+(a/b));
	}

}

public class Interface3 {

	public static void main(String[] args) {
		Caculator5 obj = new Caculator5();
		obj.addition(10, 20);
		obj.subtraction(10, 20);
		obj.multiplication(10, 20);
		obj.divition(40, 20);
		
	}

}
