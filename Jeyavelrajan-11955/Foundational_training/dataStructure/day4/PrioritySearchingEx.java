
//priority searching using Deque
package com.jeyavel.day4;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class PrioritySearchingEx {

	public static void main(String[] args) {
		Queue <Integer> queue = new LinkedList<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 System.out.println("queue Input:");
		 int input = sc.nextInt();
		 System.out.println("queue Input Are:"+input);
		 for(int i=0;i<input;i++) {
			 int input2 = sc.nextInt();
			 queue.offer(input2);
		 }
		 System.out.println("Enter the no to search in the coll :");
		 int temp = sc.nextInt();
		 boolean inputuser = true;
		 while(!queue.isEmpty()) {
			 if(queue.poll()==temp) {
				 System.out.println("Present in the list");
				 inputuser=false;
				 break;
				 
			 }
			 
		 }
		 if(inputuser) {
			 System.out.println("Not Present In the list");
		 }
	}

}
