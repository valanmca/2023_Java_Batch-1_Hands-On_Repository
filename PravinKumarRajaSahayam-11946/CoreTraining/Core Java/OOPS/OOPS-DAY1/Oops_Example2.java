//Write a Java program for calculator addtions,substractions,multiply,and,divide.
class Calculator {
	int number1;
	int number2;
	static int number3 = 40;
	static int number4 = 80;

	Calculator(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	void addition() {
		System.out.println("addition is :" + (number1 + number2));
	}

	void substraction() {
		System.out.println("substraction is : " + (number1 - number2));
	}

	static void multiply() {
		System.out.println("multiply is : " + (number3 * number4));
	}

	static void divide() {
		System.out.println("divide is : " + (number3 / number4));
	}
}

public class Oops_Example2 {

	public static void main(String[] args) {
		Calculator obj = new Calculator(10, 30);
		obj.addition();
		obj.substraction();

		Calculator.multiply();
		Calculator.divide();
	}
}