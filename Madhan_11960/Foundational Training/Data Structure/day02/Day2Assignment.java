package com.madhan.day02;
import java.util.*;

public class Day2Assignment {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the digit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
		{
			int value=sc.nextInt();
			list.add(value);
		}
         ArrayList<Integer> digitlist=new ArrayList<Integer>();
         int count;
         for(int i=0;i<n;i++)
         {
        	 int temp=list.get(i);
        	  count=0;
        	 while(temp!=0)
        	 {
        		 temp=temp/10;
        		 count++;
        	 }
        	
        	 digitlist.add(count);
         }
         System.out.println(digitlist);
         
         for(int i=0;i<n;i++)
         {
           System.out.println("Total no of digits in "+ list.get(i) + " is " + digitlist.get(i)); 
         }
	}

}
