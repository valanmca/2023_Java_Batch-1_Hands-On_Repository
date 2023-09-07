package com.madhan.day03;

public class PatternHomework2 {

	public static void main(String[] args) {
		int n=5,x=n;
		for(int i=1;i<=n*n;i++)
		{
			if(i<x)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
			
			if(i%n==0)
			{
				x=x+n-1;
				System.out.print("\n");
			}
		
		}
   
	}

}
