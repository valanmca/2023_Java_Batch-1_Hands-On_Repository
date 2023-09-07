package com.muthu.day1;
import java.util.*;
public class homework {
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
       int num=sc.nextInt();
       int count= 0;
       int temp=10;
       while(num>0)
       {
    	  num /=temp;
    	   count++;
    	   }
       System.out.println("Length of the given number: "+count);    	   
	}
	
	}
