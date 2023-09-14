package com.shiva.day06;

import java.util.Scanner;
import java.util.LinkedList;

public class LinkedSearch {

			public static void main(String[] args) {
				LinkedList<String> list = new LinkedList<String>();
				
				System.out.println("Enter the size of the List ");
				Scanner sc= new Scanner(System.in);
				int size =sc.nextInt();
				
				System.out.println("Enter the Strings ");
				for(int i=0;i<size;i++)
				{
					String k=sc.next();
					list.add(k);
				}
				System.out.println(list);
				
				System.out.println("Enter the String to be search ");
				String s=sc.next();
				
				boolean isPresent = false;
				for(int i=0;i<size;i++)
				{
					if(s.equals(list.get(i))) 
					{
						System.out.println("Element present inside the index : "+i);
						isPresent=true;
						break;
					}
					
				}
				if(isPresent==false)
				{
					System.out.println("Element is not present : ");
				}

			}

		}




