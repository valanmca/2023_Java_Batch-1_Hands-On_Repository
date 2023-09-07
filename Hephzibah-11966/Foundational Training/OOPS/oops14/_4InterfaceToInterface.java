package oops14;
interface Myinterface3 { // cannot create object but interface
	void addition(int a, int b); // abstract, public

	void subtraction(int a, int b);
}

interface Myinterface4 extends Myinterface3 {
	void multiplication(int a, int b); // abstract, public

	void division(float a, float b);
}

class Calculator2 implements  Myinterface4 { // normal class can implements n number of interface
	public void addition(int a, int b) { // by default interface all are public
		System.out.println("Addition :" + (a + b));
	}

	public void subtraction(int a, int b) {//by default all the methods Public, abstract
		System.out.println("Subtraction :" + (a - b)); //by default interface variables are public, static, final
	}

	public void multiplication(int a, int b) { // by default interface all are public
		System.out.println("Multiplication :" + (a * b));
	}

	public void division(float a, float b) {
		System.out.println("Division :" + (a / b));
	}

}


public class _4InterfaceToInterface {

		public static void main(String[] args) {
			Myinterface4 obj = new Calculator2();
			obj.addition(50, 50);
			obj.subtraction(100, 50);
			obj.multiplication(5, 5);
			obj.division(25f, 2f);

			
		}

	}

