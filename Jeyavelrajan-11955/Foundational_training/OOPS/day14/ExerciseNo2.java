package com.jeyavel.OOPS.day14;

//Interface using Multiple inheritance(Multiple Interface)

interface MyInterface1{
	void myMethod();//by default interface class have abstract methods and (they are default in the Public Specifier)
	void Addition(int a,int b);
	void Subraction(int a,int b);
}
interface MyInterface2{
	void myMethod();//by default interface class have abstract methods and (they are default in the Public Specifier)
	void Multiplication(int a,int b);
	void Division(int a,int b);
}


//a normal class can implements n number of interface 
class calculator1 implements MyInterface1,MyInterface2{
	public void Addition(int a,int b) {
		System.out.println("Addition ->"+ (a+b));
	}
	public void Subraction(int a,int b) {
		System.out.println("Subraction->"+(a-b));
	}
	public void Multiplication(int a,int b) {
		System.out.println("Addition ->"+ (a*b));
	}
	public void Division(int a,int b) {
		System.out.println("Subraction->"+(a/b));
	}
	@Override
	public void myMethod() {
		System.out.println("default Method without Argunments");
		
	}
}

public class ExerciseNo2 {

	public static void main(String[] args) {
		//declaration must me in this type when we use more than one interface in a normal class
		//using multiple interface 
		calculator1 inter=new calculator1();
		inter.myMethod();
		inter.Addition(67, 20);
		inter.Subraction(89, 23);
		inter.Multiplication(12, 6);
		inter.Division(45, 3);
		

	}

}
