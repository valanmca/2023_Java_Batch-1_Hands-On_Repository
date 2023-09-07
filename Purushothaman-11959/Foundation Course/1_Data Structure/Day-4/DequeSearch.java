package com.purushoth.day4;
import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;

public class DequeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> queue=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int a=sc.nextInt();
		System.out.println("The elements are: ");
		for (int i=0;i<a;i++) {
			queue.offerFirst(sc.nextInt());
		}
		System.out.println("The deque is: "+queue);
		System.out.println("The search element is: ");
		int search=sc.nextInt();
		int count=0;
		while(!queue.isEmpty()) {
			int b=queue.pollLast();
			if(b==search) {//If we use string b==search(b.equals(search)).
				System.out.println("The element "+b+" is found.");
				count++;
			}
		}
		if(count==0) {
			System.out.println("The element is not found.");
		}
	}

}// Search queue using deque.
