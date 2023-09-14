package com.dharshu.day14;
//Interfaces
interface MyInterfaces1{
	void addition(int a,int b); //abstract,public
	void subtraction(int a,int b);
}

interface MyInterfaces2 extends MyInterfaces1{
	void multiplication(int a,int b); //abstract,public
	void division(int a,int b);
}

class Calculators implements MyInterfaces2{ //an normal class can implements "n" no.of interface class
	public void addition(int a,int b) {
		System.out.println("Addition:"+(a+b));
		}
	
	public void subtraction(int a,int b) {
		System.out.println("Subtraction:"+(a-b));
		}
	
	public void multiplication(int a,int b) {
		System.out.println("Multiplication:"+(a*b));
		}
	
	public void division(int a,int b) {
		System.out.println("Division:"+(a/b));
		}
}

public class ExtendsInterface {

	public static void main(String[] args) {
		Calculators obj=new Calculators();
		obj.addition(10, 20);
		obj.subtraction(20, 10);
		obj.multiplication(10, 20);
		obj.division(20, 10);


	}

}
