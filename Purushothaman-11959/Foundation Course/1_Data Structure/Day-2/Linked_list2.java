package com.purushoth.day2;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked_list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list =new LinkedList<Integer>();
		LinkedList<Integer> list2 =new LinkedList<Integer>();

		/*list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);*/
		for(int i=1;i<11;i++) {
			list.add(i);
		}
		
		System.out.println("The list is: "+list);
		//int mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		for (int i=0;i<list.size();i++) {
			//mul=list.get(i)*number;
			//list2.add(mul);
			list2.add(list.get(i)*number);
		}
		System.out.println("The list2 is: "+list2);
		
		
		
		

	}

}//Multiply with a number in the list
