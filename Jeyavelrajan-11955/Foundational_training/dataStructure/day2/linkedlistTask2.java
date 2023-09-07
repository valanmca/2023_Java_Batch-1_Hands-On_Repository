package com.jeyavel.day2;
import java.util.*;
public class linkedlistTask2 {
	public static void main(String []args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> Evenlist = new LinkedList<Integer>();
		LinkedList<Integer> oddlist = new LinkedList<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Total Numbers of L1");
		int total = sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<total;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("The Values Are"+list);
		
		for (int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				Evenlist.add(list.get(i));
			}
			else {
				oddlist.add(list.get(i));
			}
			
		
		}
		System.out.println("The Even values are"+Evenlist);
		System.out.println("The odd values are "+oddlist);
	}

}
