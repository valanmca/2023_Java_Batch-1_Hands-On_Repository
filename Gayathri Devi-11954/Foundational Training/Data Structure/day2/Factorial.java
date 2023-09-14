package com.gayathri.day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ans=1;
		System.out.println("\nEnter a element : ");
		int num =  sc.nextInt();
		for(int i=1;i<num;i++) {
			ans = ans*i;			
		}
		System.out.println("The factorial value : "+ans);
sc.close();
	}

}
    