package com.dharshu.day4;

import java.util.LinkedList;
//import java.util.Queue;
import java.util.Scanner;

public class PalindromQueue {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		LinkedList<Integer> list1=new LinkedList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the range:");
		int pal=sc.nextInt();
		
		System.out.println("Enter the queue values:\n");
		for(int i=0;i<pal;i++) {
			int value=sc.nextInt();
		    list.add(value);
		}
		System.out.println("Initial Value:\n"+list);
		boolean bool=false;
		int num2=0;
		for(int i=pal-1;i>=0;i--) {
			num2=list.get(i);
			list1.add(num2);
		}
			System.out.println("The Palindrom List:"+list1);
			for(int i=0;i<pal;i++) {
				if(list.get(i)==list1.get(i)) {
					bool=true;
				}
				else
					bool=false;
			}
			if(bool==true)
				System.out.println("The given number is Palindrom");
				
			else
				System.out.println("The given number is not Palindrom");
			sc.close();
		}
		
	}



