package com.jeyavel.OOPS.day14;


//Interface-> interface = extends 


interface MyInterface3{
    void myMethod();//by default interface class have abstract methods and (they are default in the Public Specifier)
	void Addition(int a,int b);
	void Subraction(int a,int b);
}
interface MyInterface4 extends MyInterface3{
	void myMethod();//by default interface class have abstract methods and (they are default in the Public Specifier)
	void Multiplication(int a,int b);
	void Division(int a,int b);
}


//a normal class can implements n number of interface 
class calculator2 implements MyInterface4{
	public void Addition(int a,int b) {
		System.out.println("Multiple interface Addition ->"+ (a+b));
	}
	public void Subraction(int a,int b) {
		System.out.println("Multiple interface Subraction->"+(a-b));
	}
	public void Multiplication(int a,int b) {
		System.out.println("Multiple interface Addition ->"+ (a*b));
	}
	public void Division(int a,int b) {
		System.out.println("Multiple interface Subraction->"+(a/b));
	}
	@Override
	public void myMethod() {
		System.out.println("Multiple interface ->default Method without Argunments");
		
	}
}
public class ExerciseNo3 {

	public static void main(String[] args) {
		//we call the object of sub class 
		calculator2 inter =new calculator2();
		inter.Addition(34, 96);
		inter.Subraction(39, 9);
		inter.Multiplication(45, 9);
		inter.Division(23, 45);
		inter.myMethod();

	}

}
