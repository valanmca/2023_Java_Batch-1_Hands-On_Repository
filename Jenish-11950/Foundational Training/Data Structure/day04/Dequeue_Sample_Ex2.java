package com.jenish.day04;
//search in Dequeue
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class Dequeue_Sample_Ex2 {

	public static void main(String[] args) {
		Deque<String> dequeue=new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values");
		int value= sc.nextInt();
	
		System.out.println("Enter your Element:");
		for(int i=0; i<value; i++) {
			dequeue.offer(sc.next());
		}
		boolean flag=false;
		System.out.println("Dequeue output:" +dequeue);
		System.out.println("Enter the search element:");
		String search;
		search=sc.next();
		while(!dequeue.isEmpty()) {
			
			
			if((dequeue.poll()).equals(search)) {
				flag=true;
			}
		System.out.print("Result:");
		
			
	}
		if (flag==true)
		{ 
			System.out.println("Strings is Found");}
	
		else 
		{
			System.out.println("Strings is Not Found");
			
	}
		sc.close();


}
}