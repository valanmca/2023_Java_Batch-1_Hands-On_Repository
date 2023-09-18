//Using Instance Variables and Static Variables with get the input from the user
package com.pravinkumar.day10;

import java.util.Scanner;

public class OOPS_Exs_5 {
	static Scanner sc = new Scanner(System.in);
	Scanner sce = new Scanner(System.in);

    int a = sce.nextInt();

	static int b = sc.nextInt();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPS_Exs_5 obj = new OOPS_Exs_5();
		System.out.println(obj.a + OOPS_Exs_5.b);
	}

}
