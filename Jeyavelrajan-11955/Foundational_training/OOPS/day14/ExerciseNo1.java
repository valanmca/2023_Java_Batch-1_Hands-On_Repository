package com.jeyavel.OOPS.day14;

//Main class will be a abstract class 
//By Default object is a pre defined class from java.lang package


//Interface
interface MyInterface{
	void myMethod();//by default interface class have abstract methods and (they are default in the Public Specifier)
	void Addition(int a,int b);
	void Subraction(int a,int b);
}

class calculator implements MyInterface{
	public void Addition(int a,int b) {
		System.out.println("Addition ->"+ (a+b));
	}
	public void Subraction(int a,int b) {
		System.out.println("Subraction->"+(a-b));
	}
	@Override
	public void myMethod() {
		System.out.println("default Method without Argunments");
		
	}
}
 public class ExerciseNo1 {

	public static void main(String[] args) {
		MyInterface inter =new calculator();
		inter.Addition(43, 12);
		inter.Subraction(34, 13);
		inter.myMethod();
		
	}

}
