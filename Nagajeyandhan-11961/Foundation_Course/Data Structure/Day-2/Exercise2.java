//Multiple with displaying the values in LinkedList

package com.jeyandhan.day02;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list1= new LinkedList<Integer>(); //list1
		LinkedList<Integer> list2= new LinkedList<Integer>(); //list2
		
		for(int i=1;i<=10;i++) { 
			list1.add(i); //adding elements
		}
		
		System.out.println("The element in the list1 are: "+list1); //list1 elements
		
		System.out.println("Enter a number: "); //user input
		int n=sc.nextInt();
		
		for(int i=0;i<list1.size();i++) {
			list2.add(list1.get(i)*n); //multiply with n and storing in list2
		}
		System.out.println("The element in the list2 are: "+list2); //list2elements
		
		for(int i=0;i<list1.size();i++) {
				System.out.println(list1.get(i)+"*"+n+"="+list2.get(i));
			}
	}

	}

