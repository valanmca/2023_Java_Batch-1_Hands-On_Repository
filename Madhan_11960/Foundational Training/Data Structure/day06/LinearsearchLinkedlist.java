package com.madhan.day06;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinearsearchLinkedlist {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		System.out.println("Enter the Size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the Names:");
		for(int i=0;i<size;i++)
		{
			String value=sc.next();
			list.add(value);
		}
		System.out.println(list);
		
		System.out.println("Enter the string to be searched:");
		String search=sc.next();
	
		boolean isPresent=false;
		for(int i=0;i<size;i++)
		{
			if(search.equals(list.get(i)))
			{
				System.out.println("String is present at:"+i);
				isPresent=true;
				break;
			}
		}
      if(isPresent==false)
      {
    	  System.out.println("String is not present");
      }

	}

}
