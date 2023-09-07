package oops14;

//implementing multiple interface

interface Myinterface1 { // cannot create object but interface
	void addition(int a, int b); // abstract, public

	void subtraction(int a, int b);
}

interface Myinterface2 {
	void multiplication(int a, int b); // abstract, public

	void division(int a, int b);
}

class Calculator1 implements Myinterface1, Myinterface2 { // normal class can implements n number of interface
	public void addition(int a, int b) { // by default interface all are public
		System.out.println("Addition :" + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction :" + (a - b));
	}

	public void multiplication(int a, int b) { // by default interface all are public
		System.out.println("Multiplication :" + (a * b));
	}

	public void division(int a, int b) {
		System.out.println("Division :" + (a / b));
	}

}

public class _3MultileInterface {

	public static void main(String[] args) {
		Myinterface1 obj = new Calculator1();
		obj.addition(10, 20);
		obj.subtraction(30, 10);

		Myinterface2 obj1 = new Calculator1();
		obj1.multiplication(10, 20);
		obj1.division(10, 20);

		Calculator1 obj3 = new Calculator1();
		obj3.addition(10, 20);
		obj3.subtraction(30, 10);
		obj3.multiplication(5, 4);
		obj3.division(100, 10);
	}

}

//extends mean it has to call constructor of superone
//implements will not call the constructor of superclass
//class to class---- extends
//class to interface-----implements
//interface to interface---- extends
