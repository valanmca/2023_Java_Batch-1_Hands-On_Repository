package com.jeban.OOPsday4;//Over Loading Polymorphism-1)Method Over Loading -2)Constructor overloading

class Myclass{
	void myMethod(String Name,String address) {
		System.out.println("Name:"+Name);
		System.out.println("Address:"+address);
		}
	void myMethod(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
			}
		System.out.println("Factorial:"+fact);
	}
	void myMethod(int a ,int b) {
		int sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	
}

public class polymorphism1 {

	public static void main(String[] args) {
		Myclass obj=new Myclass();
		obj.myMethod("Jeban","PDKT");
		obj.myMethod(3);
		obj.myMethod(12,50);

	}

}
