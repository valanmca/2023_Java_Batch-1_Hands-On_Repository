//Instance Method and Static Methods
package com.pravinkumar.day10;

//Types of Methods
public class OOPS_Exs_9 {
//Instance Method
	void myMethod1() {
		System.out.println("Instance Method");
	}

	// Static Method
	static void myMethod2() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//We can calling the Method for the Instance Variables
		OOPS_Exs_9 obj = new OOPS_Exs_9();
		obj.myMethod1();

		// We can not necessary for the calling the Method of the Static Variables
		OOPS_Exs_9.myMethod2();
	}

}
