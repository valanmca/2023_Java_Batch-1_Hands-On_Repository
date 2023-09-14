
//multiplication table using Linked List
package com.jeyavel.day2;
import java.util.LinkedList;
import java.util.Scanner;
public class linkedlisttask1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();//Declaration
		
		for (int i=1;i<=10;i++) {//Append 
			list.add(i);//i has the user input elements 
		}
		System.out.println("L1 values are "+ list);//print 
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		int number;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value :");
		number  = sc.nextInt();
		for(int i=0;i<10;i++) {
			
			list2.add(list.get(i)*number);
		}
		System.out.println("List 2 ="+list2);
		
		for(int i=0;i<list.size();i++) {

		   System.out.println(list.get(i)+"*"+number+"="+list2.get(i));
		

	}

  }
}
