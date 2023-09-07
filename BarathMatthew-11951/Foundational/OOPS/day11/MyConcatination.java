package com.matthew.day11;

public class MyConcatination {
	void concat(int a, int b) {
		System.out.println("int :"+a+b);
	}
	
	void concat(float a, float b) {
		System.out.println("float :"+a+b);
	}
	
	void concat(String a, String b) {
		System.out.println("String :"+a+b);
	}
	public static void main(String[] args) {
		MyConcatination conCat = new MyConcatination();
		conCat.concat(10, 20);
		conCat.concat(12.4f,34.5f);
		conCat.concat("Barath", "Matthew");
	}
}
