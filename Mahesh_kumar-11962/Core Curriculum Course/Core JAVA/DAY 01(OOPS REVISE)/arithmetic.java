package com.mahesh.core_java;

public class arithmetic {
	static float number1;
	static float number2;

	arithmetic(float n1, float n2) {
		this.number1 = n1;
		this.number2 = n2;
	}

	float add() {

		return number1 + number2;
	}

	float subract() {

		return number1 - number2;
	}

	static float mul() {

		return number1 * number2;
	}

	static float div() {

		return number1 / number2;
	}

	void disp() {
		
		System.out.println("ADD : " + add());
		System.out.println("SUB : " + subract());
		System.out.println("MUL : " + mul());
		System.out.println("DIV : " + div());

	}

	void calculate()
	{
		
	}
	public static void main(String[] args) {

		arithmetic object = new arithmetic(23, 2);
		System.out.println("");
		object.disp();
		System.out.println("\nADD :"+(number1 + number2));
		System.out.println("SUB :"+(number1 - number2));
		System.out.println("MUL :"+(number1 * number2));
		System.out.println("DIV :"+(number1 / number2));
		
	}

}
