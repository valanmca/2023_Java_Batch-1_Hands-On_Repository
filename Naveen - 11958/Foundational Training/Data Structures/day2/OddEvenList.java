package com.naveen.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> Even = new ArrayList<Integer>();
		ArrayList<Integer> Odd = new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array :");
		int range=sc.nextInt();
		System.out.println("Enter The List Values :");
		for(int i=0; i<range; i++) {
		  int num = sc.nextInt();
		  list.add(num);
		}
		System.out.println("The List are :" +list);
		
		for(int i=0; i<range; i++) {
			if(list.get(i)%2 == 0)
				Even.add(list.get(i));
			else
				Odd.add(list.get(i));
			}
		System.out.println("The Even List are :" +Even);
		System.out.println("The Odd List are :" +Odd);
		
		sc.close();
		}

	}


