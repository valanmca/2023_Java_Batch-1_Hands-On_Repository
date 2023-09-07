package com.dharshu.day11;

//Constructor Overloading

 class construct{
	public construct(String name) {
		System.out.println("Welcome " + name);
	}
	
	public construct(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) 
			fact=fact*i;
		System.out.println("Factorial of  "+ n + " is: " + fact);
	}
	
	public construct(int a,int b) {
		int sum=a+b;
		System.out.println("Sum:" + sum);
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
//		construct obj1=new construct("Dharshu");
//		construct obj2=new construct(5);
//		construct obj3=new construct(2,2);

		construct obj;  //creat one object and access all the three constructor
		obj=new construct("Dharshu");
		obj=new construct(5);
		obj=new construct(5,5);
	}

}
