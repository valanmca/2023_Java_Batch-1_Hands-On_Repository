//Concatenate two values(integer,string,float)

package com.jeyandhan.day11;

class Concatinate {

	public void concat(int a, int b) {
		System.out.println(a+""+b);
	}

	public void concat(float a, float b) {
		System.out.println(a+""+b);
	}

	public void concat(String a, String b) {
		System.out.println(a+b);
	}

}

public class Concatination {

	public static void main(String[] args) {
		Concatinate obj = new Concatinate();
		obj.concat(12, 15);
		obj.concat(12.0f, 15.0f);
		obj.concat("Naga", "Jeyandhan");
	}

}
