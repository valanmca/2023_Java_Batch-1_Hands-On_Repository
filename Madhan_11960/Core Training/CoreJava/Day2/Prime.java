package com.madhan.coreday2;

public class Prime {

	public static void main(String[] args) {
		int count,n=0,i=1,sum=0;
		while(n<10)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
				sum=sum+i;
			  n++;
				
			}
			i++;
		}
		
		System.out.println("Sum of 10 prime number is :"+sum);

	}

}
