package com.domnic.day2;
import java.util.ArrayList;
import java.util.Scanner;
public class ListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
//	
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);
//		list.add(10);
		System.out.println(list);
		int n;
		n=sc.nextInt();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		System.out.println("Entered number is :"+n);
		for (int i=0;i<list.size();i++) {
			list2.add(n*list.get(i));
			
		}
		System.out.println(list2);
		
	
		
  	}

}
