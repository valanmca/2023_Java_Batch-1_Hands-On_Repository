package com.jeyavel.Assignment;

import java.util.Scanner;
import java.util.LinkedList;

public class Assignment4 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(" Enter the Total Numbers of L1");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<total;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("The default list order is "+list);
		
		System.out.println("Enter your input");
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int userNo = sc1.nextInt();
		
		System.out.println("The user Enter imput is "+ userNo);
		
		boolean flag = false;
		int index = 0;
		for (int i=0;i<total;i++) {
			if(list.get(i)==userNo) {
//				System.out.println("It is Present the user input is = "+userNo);
			  flag = true;
			  index=i;
			  break;
		}
		

		}
		if(flag==true) {
			System.out.println(" it is  Present the index no  "+index);
		}else {
			System.out.println("It is Not Present ");
		}

	}





	}


