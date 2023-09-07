
// No of Digits 
package com.jeyavel.day1;
import java.util.Scanner;
public class noOfDigits {
      
	public static void main(String[] args) {
		int count=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int number = sc.nextInt();
		System.out.println("the value is :"+ number );
		
		while (number!=0) {
			number/=10;       //  234/10 != 0 count 1
			++count;
			
		}
	System.out.println("the number count is :" + count );
		
		
		

	}

}
