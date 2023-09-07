package com.swetha.day11;

//Constructor overloading
class Class1{   //Same method names with different functionality with different arguments
	public Class1(String name) {
		System.out.println("Welcome : "+name);
	}
	
	public Class1(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
	   
		}
		System.out.println("The factorial : "+fact);
	}
	
	public Class1(int a,int b) {
		int sum=0;
		sum=a+b;
		System.out.println("The sum is : "+sum);
	}
}

public class ConstuctOverload {

	public static void main(String[] args) {
		Class1 obj=new Class1("Swetha");
		Class1 obj1=new Class1(5);
		Class1 obj2=new Class1(10,20);
		

	}

}
