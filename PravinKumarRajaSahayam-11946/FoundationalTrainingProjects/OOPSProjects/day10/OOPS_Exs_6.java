//Differenate the Instance Variables VS Static Variables
package com.pravinkumar.day10;
//Instance Variables using Methods
public class OOPS_Exs_6 {
	int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPS_Exs_6 obj1 = new OOPS_Exs_6();// 10
		OOPS_Exs_6 obj2 = new OOPS_Exs_6();// 10

		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		obj1.a = 20;// Using this we can Change the Numbers

		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}

}
