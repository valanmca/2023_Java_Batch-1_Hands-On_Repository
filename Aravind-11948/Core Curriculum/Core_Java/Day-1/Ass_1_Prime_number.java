package com.core.day_01;

public class Ass_1_Prime_number {

	public static void main(String[] args) {
		int n=0,i=1,j;
		int sum=0;
		
		while (n<10)
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
		        n++;
		      }
		      i++;
		}
		
		System.out.println("Sum "+sum);

	}

}
