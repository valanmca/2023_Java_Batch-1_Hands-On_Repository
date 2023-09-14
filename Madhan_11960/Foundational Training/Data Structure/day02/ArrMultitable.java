package com.madhan.day02;
import java.util.*;

public class ArrMultitable {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			list1.add(i);
		}
		System.out.println("Size is :" +list1.size());
		System.out.println(list1);
		
	    System.out.println("Enter the elements:");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	   
	    ArrayList<Integer> list2=new ArrayList<Integer>();
	    for(int i=0;i<list1.size();i++)
	    {
	      	list2.add(n*list1.get(i));
	    }
		  System.out.println(list2);
		 
		  for(int i=0;i<list1.size();i++)
		  {
			  System.out.println(list1.get(i)+"*"+n+"="+ list2.get(i));
				
		  }
		  
		
	}

}
