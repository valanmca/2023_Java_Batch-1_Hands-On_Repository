package com.purushoth.day4;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class QueueSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No of elements: ");
		int a=sc.nextInt();
		System.out.println("The elements are: ");
		for(int i=0;i<a;i++) {
			queue.offer(sc.nextInt());
		}
		System.out.println("Search element is: ");
		int search=sc.nextInt();
		int count=0;
		while(! queue.isEmpty()) {
			int b=queue.poll();
			if(b==search) {
				System.out.println("The element "+b+" is found.");
				count++;
			}
		}
			if(count==0) {
				System.out.println("The element is not found.");
			
			}
		
		

	}

}//To search without contains.
