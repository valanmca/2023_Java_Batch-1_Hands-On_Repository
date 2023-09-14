package com.shiva.day06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {

	public static void main(String[] args) 
	{
		ArrayList<Character> list = new ArrayList<Character>();
		
		System.out.println("Enter the size of the List ");
		Scanner sc= new Scanner(System.in);
		int size =sc.nextInt();
		
		System.out.println("Enter the Characters ");
		for(int i=0;i<size;i++)
		{
			char k=sc.next().charAt(0);
			list.add(k);
		}
		
		System.out.println("Enter the Characters to be search ");
		char s=sc.next().charAt(0);
		
		boolean isPresent = false;
		for(int i=0;i<size;i++)
		{
			if(s==list.get(i)) 
			{
				System.out.println("Element present inside the index : "+i);
				isPresent=true;
				break;
			}
			
		}
		if(isPresent==false)
		{
			System.out.println("Element is not present : "+s);
		}

	}

}
