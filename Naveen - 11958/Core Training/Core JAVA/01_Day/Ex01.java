package com.naveen.day1;

import java.util.Scanner;

/*Sum first ten prime numbers*/


public class Ex01 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the length of the prime numbers to add :");
		    int n,sum=0,i=1,j;
		    n=sc.nextInt();
		    int t=n;
		    while(n!=0)
		    {
		      int count=0;
		      for(j=1;j<=i;j++)
		      {
		        if(i%j==0)
		        {
		          count++;
		        }
		      }
		      if(count==2)
		      {
		        sum=sum+i;
		        n--;
		      }
		      i++;
		    }
		    System.out.println("Sum of first "+t+" prime numbers is "+sum);
	}

}

