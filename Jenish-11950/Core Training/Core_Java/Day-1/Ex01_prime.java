package com.jenish.day1;
import java.util.Scanner;
public class Ex01_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to add prime numbers:");
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
