package com.matthew.day04;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class SearchInQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		//getting the size of the queue
		System.out.println("Enter the size of the Queue : ");
		int size = sc.nextInt();
		//Getting the queue values
		System.out.println("Enter the values : ");
		for(int i = 0;i<size;i++) {
			int temp = sc.nextInt();
			queue.offer(temp);
		}
		//getting the value to check with queue 
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		boolean isPresent = false;
		while(!queue.isEmpty()) {
			if(num == queue.poll()) {
				System.out.println(num+" is Present in the Queue");
				isPresent= true;
				break;
			}
		}
		if (!isPresent) {
			System.out.println(num+" is not Present in the Queue");
		}
	}

}
