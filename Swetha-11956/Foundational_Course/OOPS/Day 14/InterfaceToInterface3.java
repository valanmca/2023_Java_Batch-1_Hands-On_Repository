package com.swetha.day14;

interface MyInterface01{
	void addition(int a,int b);  //By default,interface methods are public and Abstract
	void subraction(int a,int b);    
}
interface MyInterface02 extends MyInterface1{
	void multiplication(int a,int b);     //abstract , public
	void division(int a,int b);
}

//Interface2 contains the functionalities of Interface1

class Calculate implements MyInterface02 {  //It is enough to implement only Interface2
	
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
public class InterfaceToInterface3 {

	public static void main(String[] args) {
		Calculate obj=new Calculate();
		obj.addition(10,20);
		obj.subraction(20,10);
		obj.multiplication(10,10);
		obj.division(20,10);

	}

}
