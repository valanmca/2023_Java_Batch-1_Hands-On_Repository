//Interface
package com.matthew.day14;
// Main class can also be abstract
//By default the interface class are public abstract method
//A normal class implements n number of interface 
//the 
interface MyInterface{
	void addition(int a, int b);
	void subtraction(int a, int b);
	
}
class Claculator implements MyInterface{
	//we are using public because the methods in interface is public
	public void addition(int a, int b) {
		System.out.println("Addition of two no : "+(a+b));
	}
	public void subtraction(int a, int b) {
		System.out.println("subtraction of two no : "+(a-b));
	}
}
public class MyClass {

	public static void main(String[] args) {
		//creating reference for MyInterface
		MyInterface obj;
		obj = new Claculator();
		obj.addition(20, 10);
		obj.subtraction(20, 10);
		
	}

}
