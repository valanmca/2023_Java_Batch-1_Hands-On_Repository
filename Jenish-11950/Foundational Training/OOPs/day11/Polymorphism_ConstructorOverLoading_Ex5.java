package com.jenish.day11;
//Constructor OverLoading

class myClass{
	void myClass(String name) {
		System.out.println("Welcome : " +name);
	}
	
	void myClass(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) 
			fact=fact*i;
		System.out.println("Factorial : " +fact);
	}
	
	void myClass(int a, int b) {
		int sum=a+b;
		System.out.println("Sum : " +sum);
		
	}
}
public class Polymorphism_ConstructorOverLoading_Ex5 {

	public static void main(String[] args) {
		myClass obj_1 = new myClass();
		
		obj_1.myClass("Jenish");
		obj_1.myClass(6);
		obj_1.myClass(18, 19);

	}

}
