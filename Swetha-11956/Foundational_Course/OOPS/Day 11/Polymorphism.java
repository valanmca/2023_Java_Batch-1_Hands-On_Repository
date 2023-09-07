package com.swetha.day11;
//Method Overloading

class MyClass{   //Same method names with different functionality with different arguments
	void myMethod(String name) {
		System.out.println("Welcome : "+name);
	}
	void myMethod(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
	   
		}
		System.out.println("The factorial : "+fact);
	}
	void myMethod(int a,int b) {
		int sum=0;
		sum=a+b;
		System.out.println("The sum is : "+sum);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.myMethod(5);
		obj.myMethod(3,5);//memeory created for variable during compiletime from stack
		obj.myMethod("Swetha");
		

	}

}
