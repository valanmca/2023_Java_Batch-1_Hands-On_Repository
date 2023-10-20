package com.jenish.day5;

public class Method_overloading {
	void concat(int a, int b) {
		System.out.println(a + "" + b);
	}
	void concat(String a, String b) {
		System.out.println(a + "" + b);
	}
	void concat(float a, float b) {
		System.out.println(a + "" + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading obj = new Method_overloading();
		obj.concat("Jenish", "Immanuel");
		obj.concat(200.0f, 300.0f);
		obj.concat(0, 0);
	}

}
