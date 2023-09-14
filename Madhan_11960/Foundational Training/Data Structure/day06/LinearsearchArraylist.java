package com.madhan.day06;
import java.util.Scanner;
import java.util.ArrayList;

public class LinearsearchArraylist {

	public static void main(String[] args) {
		ArrayList<Character> list=new ArrayList<Character>();
		System.out.println("Enter the Size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the Elements:");
		for(int i=0;i<size;i++)
		{
			char value=sc.next().charAt(0);
			list.add(value);
		}
		System.out.println(list);
		
		System.out.println("Enter the search element");
		int search=sc.next().charAt(0);
		
		boolean isPresent=false;
		for(int i=0;i<size;i++)
		{
			if(list.get(i)==search)
			{
				System.out.println("Element is present");
				isPresent=true;
				break;
			}
		}
      if(isPresent==false)
      {
    	  System.out.println("Element is not present");
      }
	}

}
