package com.shiva.day06;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedMidSearch {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		System.out.println("Enter the size of the List ");
		Scanner sc= new Scanner(System.in);
		int size =sc.nextInt();
		
		System.out.println("Enter the Elements ");
		for(int i=0;i<size;i++)
		{
			int k=sc.nextInt();
			list.add(k);
		}
		System.out.println(list);
		
		System.out.println("Enter the Elements to be search ");
		int s=sc.nextInt();
		
		
		int beg=0;
		int end=list.size()-1;
		int mid=(beg+end)/2;
		
		boolean isPresent=false;
		while(beg<=end)
		{
			if(list.get(mid)==s)
			{
				System.out.println("Element is present in the index : "+mid);
				isPresent=true;
				break;
			}
			else if(list.get(mid)>s)
			{
				end=mid-1;
				mid=(beg+end)/2;
				
			}
			else
			{
				beg=mid+1;
				mid=(beg+end)/2;
				
			}
		}
		if(isPresent==false)
		{
			System.out.println("The Element is not present");
		}
	}


	}


