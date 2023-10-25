package com.jeyavel.coreDay1;

class oper{
//	int a;
//	int b;
	
	void add(int a, int b) {
		System.out.println("Addition of two no: "+(a+b));
	}
	void sub(int a, int b) {
		System.out.println("Subraction of two no: "+(a-b));
	}
	void mul(int a, int b) {
		System.out.println("Multiplication of two no: "+(a*b));
	}
	void div(int a, int b) {
		System.out.println("Division of two no: "+(a/b));
	}
}

public class CalcCoreEx1 {
	public static void main(String[] args) {
		oper oper1 = new oper();
		oper1.add(3,5);
		oper1.sub(20,7);
		oper1.mul(3,5);
		oper1.div(50,4);
	}

}
