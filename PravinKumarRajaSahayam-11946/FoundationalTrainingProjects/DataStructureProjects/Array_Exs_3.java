// Simple Calculator Program in java
package com.pravinkumar.day1;

import java.util.Scanner;

public class Array_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float m1,m2,sub,div,mul,mod,sum;
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number1:");
		m1= sc.nextFloat();
		
		System.out.println("Enter the Number2:");
	    m2= sc.nextFloat();
		
	    sub = m1-m2;
	    div = m1/m2;
	    mul = m1*m2;
	    mod = m1%m2;
	    sum = m1+m2;
	    
	    System.out.println("sub:" + sub);
	    System.out.println("div:" + div);
	    System.out.println("mul:" + mul);
	    System.out.println("mod:" + mod);
	    System.out.println("sum:" + sum);

	}

}
