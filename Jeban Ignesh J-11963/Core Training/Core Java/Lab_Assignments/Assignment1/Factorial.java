package com.jeban.LabAssignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Entr the Number:");
		Scanner sc=new Scanner (System.in);
		int f=sc.nextInt();
		int fact=1;
		for (int i=1;i<=f;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
