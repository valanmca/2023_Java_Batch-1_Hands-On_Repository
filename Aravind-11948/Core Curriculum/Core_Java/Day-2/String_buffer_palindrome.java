package com.core.day_02;
import java.util.Scanner;
//import java.lang.*;


public class String_buffer_palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String s;
		 System.out.print("Enter the String to check = ");
		 s=sc.next();
		 
		
		 
		 System.out.print("Given String = "+s);
		 System.out.println();
		 
		 StringBuffer buf=new StringBuffer(s);
		
		
		 buf.reverse();
		 System.out.println("reverse the String = "+buf);
		 
		  String data=buf.toString();
		 if (data.equalsIgnoreCase(s))
		 {
			 System.out.println("Given String is palindrome");
		 }
		 else
		 {
			 System.out.println("Given String is not palindrome");
		 }
		 
		 
		 
	}

}
