package com.matthew.day04;
import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;
public class SearchingDeque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> queue = new LinkedList<Integer>();
		//Getting the size of the Deque
		System.out.println("Enter the size of the Collection : ");
		int num = sc.nextInt();
		System.out.println("Enter the Elements of the Collection : ");
		for (int i = 0;i<num;i++) {
			int temp = sc.nextInt();
			queue.offer(temp);
		}
		System.out.println("Enter a number to search in the Deque : ");
		int val = sc.nextInt();
		boolean isPresent = false;
		while (!queue.isEmpty()) {
			if(val==queue.poll()) {
				System.out.println(val+" is Present in the Deque");
				isPresent = true;
				break;
			}
		}
		if(!isPresent) {
			System.out.println(val+" is not Present in the Deque");
		}
	}

}
