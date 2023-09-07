package com.mahesh.Algorithm_Flowchart_day16;

import java.util.Scanner;

public class Add_Two_Number {
	
	public static void main(String[] args) {
		int number_01,number_02,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 values for sum : ");
		number_01 =sc.nextInt();
		number_02 = sc.nextInt();
		
		sum = number_01+number_02;
		
		System.out.println("Result : "+sum);
		sc.close();
		

	}

}
