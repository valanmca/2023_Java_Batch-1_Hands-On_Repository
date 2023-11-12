package com.swetha.features;
import java.util.Scanner;
public class Switch {

	public static void  main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		String num="";
	    switch (n) {
	      case 1:
	          num="one";
	          break;
	      case 2:
	    	  num="Two";
	          break;
	      case 3:
	    	  num="Three";
	          break;
	      default : num="Invalid";
	    }
	    System.out.println(num);
	  }
}
