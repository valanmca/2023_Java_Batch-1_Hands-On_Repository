package com.dharshu.OopsRecap;

import java.util.Scanner;

public class Ex03_tables {

	public static void main(String[] args) {
		
	        System.out.println("Enter the number to be multiplied : ");
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        for(int i=0; i<=10; i++) {
	            System.out.println(i +" *"+ n +" =" +(i*n));
	        }

	}

}
