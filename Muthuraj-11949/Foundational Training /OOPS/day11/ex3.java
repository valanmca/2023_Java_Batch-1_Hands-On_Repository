package com.muthu.day11;
//calling variable
//calling method
//calling constructor
// main used in this (); and automatically calling previous method,variable,constructor

public class ex3{//same class
	ex3 (String Name) {//different parameter
		this(5);
		System.out.println("Welcome:"+Name);
		
	}
	ex3 (int n){
		this(10,20);
		int fact=1;
		for (int i=1; i<=n;i++) {
			fact=fact*i;}
			System.out.println("Factorial:"+fact);
		}
	
	ex3(int a,int b) {
		int sum=a+b;
		System.out.println("sum:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex3 obj=new ex3("muthu");
	}
}
		