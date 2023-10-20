package com.dharshu.day4;

//constructor overloading
public class Constructor_Overloading {

	Constructor_Overloading(){
		this(10);
		System.out.println("A");
	}
	
	Constructor_Overloading(int a)
	{
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Overloading obj = new Constructor_Overloading();

	}

}
