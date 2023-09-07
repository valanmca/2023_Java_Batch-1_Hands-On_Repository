package com.swetha.day14;
                          //Implementing multiple  interface
interface MyInterface1{
	void addition(int a,int b);  //By default,interface methods are public and Abstract
	void subraction(int a,int b);    
}
interface MyInterface2{
	void multiplication(int a,int b);     //abstract , public
	void division(int a,int b);
}

//The normal class can implements 'n' number of interface

class Calculator1 implements MyInterface1,MyInterface2 {
	
	public void addition(int a,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	public void subraction(int a,int b) {
		System.out.println("Subraction is : "+(a-b));
	}
	public void multiplication(int a,int b) {
		System.out.println("Multiplication is : "+(a*b));
	}
	public void division(int a,int b) {
		System.out.println("Division is : "+(a/b));
	}
	
}
public class MultipleInterface2 {
	

	public static void main(String[] args) {
		Calculator1 obj=new Calculator1();
		obj.addition(10,20);
		obj.subraction(20,10);
		obj.multiplication(10,10);
		obj.division(20,10);

	}

}
