package com.muthu.day11;


public class ex2constructor {
	 ex2constructor (String Name) {//different parameter
		System.out.println("Welcome:"+Name);
		
	}
	ex2constructor (int n){
		int fact=1;
		for (int i=1; i<=n;i++) {
			fact=fact*i;}
			System.out.println("Factorial:"+fact);
		}
	
	ex2constructor(int a,int b) {
		int sum=a+b;
		System.out.println("sum:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex2constructor obj1=new ex2constructor("muthu");
		ex2constructor obj2=new ex2constructor(5);
		ex2constructor obj3=new ex2constructor(10,20);

	}

}
