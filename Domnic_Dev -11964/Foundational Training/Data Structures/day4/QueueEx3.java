//Find the user given element
package com.domnic.day4;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<String> queue = new LinkedList<String>();
        int temp=0;
		queue.offer("a");
		queue.offer("k");
		queue.offer("m");
		queue.offer("r");
		queue.offer("u");
		queue.offer("p");
		System.out.println("Enter the element to be found :");
		String element=sc.next();
		
		while(!queue.isEmpty()) {
			if(queue.poll().equals(element))
			
			{System.out.println("Yes");
				temp++;
				}
		}
			if(temp==0)
			{
				System.out.println("no");
			}
//		for(String i=0;i<queue.size();i++)
//		{
//			if(queue.poll().equals(element)) {
	//		}
//		}
		}

	}


