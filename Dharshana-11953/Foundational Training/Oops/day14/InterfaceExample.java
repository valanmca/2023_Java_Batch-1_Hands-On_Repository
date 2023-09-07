package com.dharshu.day14;

//Interfaces
interface MyInterface1{
	void addition(int a,int b); //abstract,public
	void subtraction(int a,int b);
}



class Calculator implements MyInterface1{
	public void addition(int a,int b) {
		System.out.println("Addition:"+(a+b));
		}
	
	public void subtraction(int a,int b) {
		System.out.println("Subtraction:"+(a-b));
		}
	
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		MyInterface1 obj=new Calculator();
		obj.addition(10, 20);
		obj.subtraction(20, 10);

	}

}
