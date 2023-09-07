package com.madhan.day02;
import java.util.*;

public class ArrlistPractical {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			list1.add(i);
		}
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list1.add(4);
//		list1.add(5);
		
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
		
	
		

	}

}
