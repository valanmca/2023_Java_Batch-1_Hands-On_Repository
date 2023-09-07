package oops14;

//Interface

interface Myinterface { // cannot create object but interface
	void addition(int a, int b); //abstract, public

	void subtraction(int a, int b); 
}

class Calculator implements Myinterface {
	public void addition(int a, int b) {    // by default interface all are public
		System.out.println("Addition :" + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction :" + (a - b));
	}

}

public class _2interface { // Interface is a 0%definition

	public static void main(String[] args) {
		Myinterface obj = new Calculator();
		obj.addition(10, 20);
		obj.subtraction(30, 10);
	}

}
