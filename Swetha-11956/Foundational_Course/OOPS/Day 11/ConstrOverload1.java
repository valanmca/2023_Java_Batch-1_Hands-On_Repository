package com.swetha.day11;
//constructor overloading using this keyword
//Same method names with different functionality with different arguments

class Class2{   
	public Class2(String name) {
		this(5);                           //this keyword is used inside the constructor to avoid creating multiple objects in main method
		System.out.println("Welcome : "+name);
	}
	
	public Class2(int n) {
		this(10,20);                       ///this keyword is used inside the constructor to avoid creating multiple objects in main method
		int fact=1;                       
		for(int i=1;i<=n;i++) {
			fact=fact*i;
	   
		}
		System.out.println("The factorial : "+fact);
	}
	
	public Class2(int a,int b) {
		int sum=0;
		sum=a+b;
		System.out.println("The sum is : "+sum);
	}
}

public class ConstrOverload1 {

	public static void main(String[] args) {
		Class2 obj=new Class2("swetha");
	}

}
