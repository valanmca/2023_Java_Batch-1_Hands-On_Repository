package com.shiva.day02;

import java.util.*;//Multiple with number in LinkedList

public class ListExample {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		for(int i=0;i<=10;i++)
		{
			list.add(i);
		}
		/*list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);*/
		
		System.out.println(list);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value to be multiplied ");
		int n=sc.nextInt();
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		for(int i=0;i<list.size();i++)
		{
			list2.add(n*list.get(i));
		}
		System.out.println(list2);

	}

}
