package com.jeban.LabAssignment;

import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		System.out.println("Enter First Number:");
		Scanner n1=new Scanner (System.in);
		int a=n1.nextInt();
		System.out.println("Enter Second Number:");
		Scanner n2=new Scanner (System.in);
		int b=n2.nextInt();
		System.out.println("Enter Third Number:");
		Scanner n3=new Scanner (System.in);
		int c=n3.nextInt();
		if (a>b && a>b ) {
			System.out.println(a + " is Largest Number");
		}
		else if(b>a && b>c){
			System.out.println(b + " is Largest Number");
		}
		else {
			System.out.println(c+ " is Largest NUmber");
		}
			
		
		

	}

}
