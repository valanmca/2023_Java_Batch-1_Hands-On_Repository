package com.aravind.day13;
//interface 
interface  MyInterface 
{
	void addition(int a,int b);// by default interface methods are abstract,public
	void subtraction(int a,int b);
}


class Calculator implements MyInterface{
	 public void addition(int a,int b)
	 {
		 System.out.println("Addition ="+(a+b));
		 }
	 public void subtraction(int a,int b)
	 {
		 System.out.println("Subtraction ="+(a-b));
	 }
}
public class InterfaceExample1 {

	public static void main(String[] args) {
		MyInterface obj=new Calculator();
		obj.addition(10,20);
		obj.subtraction(30,20 );

	}

}
