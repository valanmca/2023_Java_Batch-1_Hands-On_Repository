//Factorial

package com.jeyandhan.day02;
import java.util.*;
public class Exersise4 {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value:");
		int n = sc.nextInt(); //user input
		
		for(int i=1;i<n+1;i++) {
			fact=fact*i; //condition for factorial
		}
		
		System.out.println("The Factorial of given number is: "+fact); //printing the factorial value
	}

}
