package com.purushoth.day_05;

interface Three {
	int a=10;
}

interface Four extends Three {
	int a=20;
}

interface Five extends Three,Four {
	void sum();
}

class Calculator3 implements Five {
	public void sum() {
		System.out.println(Three.a+Four.a);
	}
}
public class Interface5 {

	public static void main(String[] args) {
		Calculator3 calc=new Calculator3();
		calc.sum();

	}

}
