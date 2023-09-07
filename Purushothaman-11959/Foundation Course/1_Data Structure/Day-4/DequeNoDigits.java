package com.purushoth.day4;
import java.util.Scanner;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;

public class DequeNoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> queue=new LinkedList<Integer>();
		Deque<Integer> queue1=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("The no.of elements is: ");
		int a=sc.nextInt();
		System.out.println("The elements are: ");
		for(int i=0;i<a;i++) {
			int temp=sc.nextInt();
		    queue.offer(temp);
		}
		System.out.println("The queue is: "+queue);	
		for (int i=0;i<a;i++) {
			int count=0;
			int num=queue.poll();
			int temp=num;
		while(num!=0) {
		    num/=10;
		    count++;
		}
	queue1.offer(count);
	System.out.println("The total number of digits " +temp+ " : "+queue1);
	
	}
			}


}//Number of digits
