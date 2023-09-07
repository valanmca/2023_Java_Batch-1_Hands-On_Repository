package com.jenish.day04;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Sample_Task2 {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values");
		int value= sc.nextInt();
	
		System.out.println("Enter your Element:");
		for(int i=0; i<value; i++) {
			queue.offer(sc.next());
		}
		boolean flag=false;
		System.out.println("Queue output:" +queue);
		System.out.println("Enter the serach element:");
		String search;
		search=sc.next();
		while(!queue.isEmpty()) {
			queue.poll();
			
			if(queue.poll()==search) {
				flag=true;
			}
		System.out.print("Result:");
		
			if (flag==true)
			{ 
				System.out.println("Strings is Found");}
		
		else {
				System.out.println("Strings is Not Found");
				sc.close();
		}


	}

	}

}