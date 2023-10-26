/***** Java program to find the sum of the first 10 prime numbers*****/
package com.sara.CoreJava.Day_02;

public class Assignment_01 {

	public static void main(String[] args) {
		
		int count;
		int c=0;
		int sum = 0;
		System.out.println("First 10 Prime Numbers ");
		
		for(int i=2; c<10 ; i++) {
			count = 0;
			
			for(int j=2; j<=i ; j++) {
				
				if(i%j == 0) {
					count++;
					
				}
			}
			if(count ==1) {
				sum = sum + i;
				System.out.println(i);
				c++;
			}
		}
		System.out.println("Sum of first 10 prime numbers is "+sum);
				
			}
		}
	

