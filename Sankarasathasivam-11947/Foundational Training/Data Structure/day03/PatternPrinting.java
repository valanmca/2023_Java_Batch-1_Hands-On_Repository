package com.shiva.day03;

import java.util.Scanner;

public class PatternPrinting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int n=sc.nextInt();
		//int index=1;
		int star=0;
		
		for(int index=1;index<=n;)
		{
			if(star<index)
			{
				System.out.print("* ");
				star++;
			}
			if(star==index)
			{
				System.out.println();
				index++;
				star=0;
			}
		}

	}

}


/*int count=1;
 * while(count<=column) 
{
	System.out.print("* ");
	count++;
}
System.out.println();
column++;*/
		
