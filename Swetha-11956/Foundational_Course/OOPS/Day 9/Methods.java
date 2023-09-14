package com.swetha.day9;

//Types of method.......Static and Instance method

public class Methods {
	
	void myMethod1() {                     //Instance method
		System.out.println("Instance Method");
	}
	static void myMethod2() {              //Static method
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.myMethod1();                    //for calling instance method
		
	    Methods.myMethod2();                //for calling static method

	}

}
