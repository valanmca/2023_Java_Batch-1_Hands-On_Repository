package com.swetha.day13;
class Animal1{
	String s=getValue();
	String getValue() {
		return "A";
	}
}
class Dogg extends Animal1 {
	String s=getValue();
	
	String getValue() {
		return "B";
	}
}
public class OverrideExample1 {

	public static void main(String[] args) {
		Dogg dog=new Dogg();
		System.out.println(dog.s);
		

	}

}
