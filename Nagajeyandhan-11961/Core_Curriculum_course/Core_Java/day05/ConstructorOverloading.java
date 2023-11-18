package com.jeyandhan.day05;

public class ConstructorOverloading {

	ConstructorOverloading(){
		this(10);
		System.out.println("A");
	}
	ConstructorOverloading(int a){
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading obj = new ConstructorOverloading();
	}

}
