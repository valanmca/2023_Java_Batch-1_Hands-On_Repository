package com.shaji.Day02;

import java.util.*;

public class LinkedList_Ex3 {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		LinkedList<Integer> even= new LinkedList<Integer>();
		LinkedList<Integer> odd= new LinkedList<Integer>();
		
		System.out.println("Enter the number : ");

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
				
		for (int i=0; i<s; i++) {
			int s1 = sc.nextInt();
			list.add(s1);
		}
	
		System.out.println(list);
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i)%2==0) {
				even.add(list.get(i));	
		}
			else {
				odd.add(list.get(i));
			}
		}
		System.out.println("Even Numbers : " + even);
		System.out.println("Odd Numbers : "+odd);
}
}
