package com.muthu.day4; 
import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

public class ex4{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		 Deque<Integer> queue=new LinkedList<Integer>();
		 //Inserting element at end /REAR
		 
		 queue.offer(10);
		 queue.offer(20);
		 queue.offer(30);
		 queue.offer(40);
		 System.out.println(queue); // [10,20,30,40]
		
		System.out.print("Enter the fount number:");//
		int num=sc.nextInt();
		int temp=0;
	while(!queue.isEmpty()){
		
	if(queue.pollFirst().equals(num)) {
			temp++; break;
	}
	else
		temp=0;
	}
	if(temp==0)
		System.out.println("no");
	else
		System.out.println("Yes");
	
	//SORTCUT
}
}	
	
