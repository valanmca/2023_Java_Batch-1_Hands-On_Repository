package com.purushoth.day_02;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1=sc.next();
		
		StringBuffer s2=new StringBuffer(s1);
		
		s2.reverse();//Reverse method is applicable only in stringbuffer.
		String s3=s2.toString(); //Changing stringbuffer to string.
		
		//System.out.println(s2);
		//System.out.println(s1);
		
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}//Palindrome using string & String Buffer
