package com.purushoth.day2;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list =new LinkedList<Integer>();
		LinkedList<Integer> list2 =new LinkedList<Integer>();
		
		for(int i=1;i<11;i++) {
			list.add(i);
		}
		
		System.out.println("The list is: "+list);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		for (int i=0;i<list.size();i++) {
			list2.add(list.get(i)*number);
		}
		System.out.println("The list2 is: "+list2);
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+"*"+number+"="+list2.get(i));
		}
		}



	}//To multiply with a number in the list with showing * and numbers.


