package com.madhan.day02;
import java.util.*;

public class ArrlstEvenoddd {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the values:");
		for(int i=0;i<size;i++)
		{
			int value =sc.nextInt();
			list.add(value);
		}
		System.out.println(list);
      ArrayList<Integer> even=new ArrayList<Integer>();
       ArrayList<Integer> odd=new ArrayList<Integer>();
       for(int i=0;i<list.size();i++)
       {
    	  
    	   if(list.get(i)%2==0)
    	   {
    		   even.add(list.get(i));
    	   }
    	   else
    	   {
    		   odd.add(list.get(i));
    	   }
       }
       System.out.println(even);
       System.out.println(odd);
	}

}
