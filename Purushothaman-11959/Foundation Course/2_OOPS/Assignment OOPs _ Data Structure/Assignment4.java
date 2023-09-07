package com.purushoth.Assignment;
import java.util.LinkedList;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		int a=sc.nextInt();
		System.out.println("Enter the values: ");
		for(int i=0;i<a;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("The list is "+list);
		System.out.println("Enter the element to find in list: ");
		int search=sc.nextInt();
		int count=0;
		for (int i=0;i<a;i++) {
			if(list.get(i)==search) {
				count++;
				System.out.println("The element "+search+" found in "+i);
			}
		}
		if(count==0) {
			System.out.println("The element is not found -1");
		}
	}

}
