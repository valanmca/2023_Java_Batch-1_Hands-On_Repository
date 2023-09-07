package com.shiva.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExampleTraverse {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value to be multiplied ");
		int n=sc.nextInt();
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		for(int i=0;i<list.size();i++)
		{
			list2.add(n*list.get(i));
			//System.out.println(list2.get(i));
		}
		//System.out.println(list);
		System.out.println(list2);
		
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list2.get(i));
		}*/
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+" *"+n+" ="+list2.get(i));
		}
	}

	}


