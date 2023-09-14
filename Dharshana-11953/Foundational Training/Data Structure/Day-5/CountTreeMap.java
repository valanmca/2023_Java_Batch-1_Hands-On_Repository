package com.dharshu.day5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class CountTreeMap {

	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<Integer>();
		//LinkedList<Integer>list1=new LinkedList<Integer>();
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>(Collections.reverseOrder());
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size:");
		int list_size=sc.nextInt();
		System.out.println("Enter the"+list_size+"elements:");
		
		for(int i=0;i<list_size;i++) {
			int num1=sc.nextInt();
			list.add(num1);
			}
		
		System.out.println("The elements in an List is:"+list);
		for(int i=0;i<list_size;i++) {
			int count=0;
			int num1=list.get(i);
			while(num1>0) {
				num1=num1/10;
				count++;
			}
			
			tm.put(list.get(i), count);

		}
		System.out.println("The Key value :" + tm);
		
		
		
	}

}
