package com.madhan.day17;
import java.util.LinkedList;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements in list");
		int n=sc.nextInt();
		 int i;
		 System.out.println("enter the list values");
		 for( i=0;i<n;i++)
		 {
		   list.add(sc.nextInt());
		 }
		 System.out.println("enter value to search in linked list");
		  int searchValue=sc.nextInt();
		 int temp=0;
		 
		for(i=0;i<n;i++)
		 {
		 if (list.get(i)==searchValue)
		  {
		  temp=1;
		 break;
		 }
		}
		 
		if(temp==1)
		 {
		   System.out.println("value is found index"+i);
		 }
		 else
		 {
		 System.out.println("-1");
		}

	}

}
