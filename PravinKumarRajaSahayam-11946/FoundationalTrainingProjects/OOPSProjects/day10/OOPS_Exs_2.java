//Local Variables , Instance Variables , Static Variables
package com.pravinkumar.day10;

//Types of Variables
public class OOPS_Exs_2 {
	int b = 20;// Instance Variables or Object Variables

	static int c = 30;// Static Variables or Class Variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;// Local Variables
		System.out.println(a);// Using this we can calling variables itself only

		OOPS_Exs_2 obj = new OOPS_Exs_2();// Using this we can calling the class name
		System.out.println(obj.b);// Usiing this we can calling the object itself

		System.out.println(OOPS_Exs_2.c);// Using this we can calling the class name
		System.out.println(obj.c);// Using this we can also calling the object
		System.out.println(c);// Using this we can calling by the Name of the variables
	}

}
