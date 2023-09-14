//Number of digits

package com.jeyandhan.day01;
import java.util.*;
public class DayOneAssignment {

	public static void main(String[] args) {
		int number,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		System.out.println("\nThe given number is: "+number); 
		while(number > 0) {
			number = number/10; 
			count++;
		}
		System.out.println("The number of digits in the given number is: " +count);
	}

}
