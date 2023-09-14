//Polymorphism means "many forms".if one task is performed in different ways.


//two types 1.Overloading 2.Overirriding
//1.method()overloding.
//Same method for different parameter.
//compile time polymorphism.



package com.muthu.day11;
class Myclass{//same method
	void myMethod(String Name) {//different parameter
		System.out.println("Welcome:"+Name);
		
	}
	void myMethod(int n){
		int fact=1;
		for (int i=1; i<=n;i++) {
			fact=fact*i;}
			System.out.println("Factorial:"+fact);
		}
	void myMethod(int a,int b) {
		int sum=a+b;
		System.out.println("sum:"+sum);
	
	}		
}
public class polymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass obj=new Myclass();
		obj.myMethod(5);
		obj.myMethod("muthu");
		obj.myMethod(10,20);

	}

}
