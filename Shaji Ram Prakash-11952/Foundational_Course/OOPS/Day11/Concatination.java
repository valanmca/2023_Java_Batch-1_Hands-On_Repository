package com.shaji.Day11;

class myConcatination{
	void concat(int a, int b){
		System.out.println(String.valueOf(a)+String.valueOf(b));
	}
	void concat(float a, float b) {
		System.out.println(String.valueOf(a)+String.valueOf(b));
	}
	void concat(String a, String b) {
		System.out.println(a+b);
	}
}

public class Concatination {

	public static void main(String[] args) {
		
		myConcatination obj = new myConcatination();
		obj.concat("Shaji", "Sara❤");
		obj.concat(10.5f,20.5f);
		obj.concat(10,20);
	}

}
