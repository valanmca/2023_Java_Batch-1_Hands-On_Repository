//Find the Count and the Factorial using Instance Method and Static Method
package com.pravinkumar.day10;
import java.util.Scanner;
public class OOPS_Exs_10 {
	void factorial(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial is : " + factorial);
	}
	
	static void digitcount(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number : " );
		int arr = sc.nextInt();
		OOPS_Exs_10 obj = new OOPS_Exs_10();
		obj.factorial(arr);
        System.out.println("Enter the Numbers : " );
        int arrays = sc.nextInt();
		OOPS_Exs_10.digitcount(arrays);
	}

}
