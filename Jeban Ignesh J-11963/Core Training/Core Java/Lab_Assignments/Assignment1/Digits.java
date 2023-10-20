package com.jeban.LabAssignment;

import java.util.*;

public class Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int m=0;
		int sum=0;
		while(number!=0){
			m=number%10;
			sum=sum+m;
			number=number/10;
			
		}
		System.out.println(sum);
		

	}

}
