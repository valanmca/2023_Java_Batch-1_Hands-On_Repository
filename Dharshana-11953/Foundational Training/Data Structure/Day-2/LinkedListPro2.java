package com.dharshu.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPro2 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList <Integer>();
		LinkedList<Integer> list1=new LinkedList <Integer>();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many element :");
		int list_size=sc.nextInt();
		//inserting the element 
		System.out.println("Enter the "+list_size+"of the element:");
		for(int i=0;i<list_size;i++) {
			int num1=sc.nextInt();
			list.add(num1);
		}
		
		System.out.println("The elements are:"+list);
		
		System.out.println("Enter the number which you have to multiply?");
		int mul_num=sc.nextInt();
		
		int res;
		for(int i=1;i<=list_size;i++) {
			res=(i)*mul_num;
		
			System.out.println(i+" *"+mul_num+"="+res);
			list1.add(res);
		}
		System.out.println("The Output is"+list1);
	
	
	}
}
