//Differenate between the Instance Variables VS Static Variables
package com.pravinkumar.day10;

//Static Variables Method only
public class OOPS_Exs_7 {
	static int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPS_Exs_7 OOPS_Exs_71 = new OOPS_Exs_7();
		OOPS_Exs_7 OOPS_Exs_72 = new OOPS_Exs_7();
		System.out.println(OOPS_Exs_71.a);// 10
		System.out.println(OOPS_Exs_72.a);// 10
		
		OOPS_Exs_71.a = 30;

		System.out.println(OOPS_Exs_71.a);// 30
		System.out.println(OOPS_Exs_72.a);// 30

	}

}
