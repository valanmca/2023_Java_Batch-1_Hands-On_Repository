package com.naveen.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		/*list.add(10); //Inserting Elements to the Array List
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Values");
		for(int i=1; i<=5; i++) {
		  int n = sc.nextInt();
		  list.add(n);
		}
		
		sc.close();

		System.out.println(list); //[10,20,30,40,50]
		
		int sum=0;
		for(int i=2;i<4;i++) {
			sum=sum+list.get(i);  // Summing the index value of 2 and 3
		}
		System.out.println("The Sum of Index 2 and 3 are :"+sum); //70
		
		list.add(0, sum);
		System.out.println(list); //[70,10,20,30,40,50]

		list.set(list.size()-1, 100); //[70,10,20,30,40,100]
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list); //[10,20,30,40,100]
	}		
}
