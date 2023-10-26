package com.naveen.day4;

//Method overloading
public class Ex05 {
	
	void concat(int a, int b) {
		System.out.println(a + " " + b);
	}
	
	void concat(String a, String b) {
		System.out.println(a + " " + b);
	}
	
	void concat(float a, float b) {
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		Ex05 obj = new Ex05();
		obj.concat(14.52f, 45.7f);
		obj.concat("Naveen", "Raj");
		obj.concat(10, 20);
	}

}
