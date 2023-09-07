package com.shaji.Day02;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Ex1 {

	public static void main(String[] args) {
		LinkedList<Integer> list1= new LinkedList<Integer>();
		LinkedList<Integer> list2= new LinkedList<Integer>();
		
		for (int i=1; i<=10; i++) {
			list1.add(i);
		}
		System.out.println(list1);
		System.out.println("Enter the value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i=0; i<list1.size(); i++) {
			list2.add(list1.get(i)*n);
		}
		System.out.println("The Values of " +n+" is "+list2);
	}
	

}
