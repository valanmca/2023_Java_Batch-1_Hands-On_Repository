package com.shaji.Day13;

class Animals{
	String s  = getValue();
	
	String getValue() {
		return "A";
	}
}

class Dogs extends Animals{
	String getValue() {
		return "B";
	}
}

public abstract class Example1 {

	public static void main(String[] args) {
		Dogs dog = new Dogs();
		System.out.println(dog.s);

	}

}
