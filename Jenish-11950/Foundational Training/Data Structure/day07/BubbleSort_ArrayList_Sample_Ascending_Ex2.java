package com.jenish.day07;

import java.util.Scanner;
import java.util.LinkedList;

public class BubbleSort_ArrayList_Sample_Ascending_Ex2 {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		LinkedList<Integer> list1= new LinkedList<Integer>();
		Scanner sc= new Scanner(System.in);
		int temp=0;
		System.out.println("Enter the size of the values:");
		int list_size=sc.nextInt();
		System.out.println("Enter the " +list_size+ " elements of the list");
		for(int i=0; i<list_size; i++) {
			int values=sc.nextInt();
			list.add(values);
		}
		System.out.println("Initial list Elements:" +list);
		for(int i=0;i<list.size();i++) {
	    	for(int j=i;j<list.size();j++) {
	    		if(list.get(i)>list.get(j)) {
	    			temp=list.get(j);
	    			list.set(j, list.get(i));
	    			list.set(i, temp);
	}
	    	}
		}
		System.out.println("Sorted listed Array");
		for(int i=0; i<list.size();i++) {
			list1.add(list.get(i));
	    	
	}
		System.out.println(list1);
		sc.close();
}
}
