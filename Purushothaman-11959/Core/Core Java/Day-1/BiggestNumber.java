package com.purushoth.day_01;

public class BiggestNumber {

	public static void main(String[] args) {
		System.out.println("Number 1 " + args[0]);
		System.out.println("Number 2 " + args[1]);
		System.out.println("Number 3 " + args[2]);
		  int a=Integer.parseInt(args[0]);
		  int b=Integer.parseInt(args[1]);
		  int c=Integer.parseInt(args[2]);
		  if(a>b && a>c) {
			  System.out.println("Bigger number is: "+a);
		  }
		  else if(b>a && b>c) {
			  System.out.println("Bigger number is: "+b);
		  }
		  else {
			  System.out.println("Bigger number is: "+c);
		  }

	}

}//6. Write a Java program to find the biggest of the given three numbers using Command Line Arguments.
