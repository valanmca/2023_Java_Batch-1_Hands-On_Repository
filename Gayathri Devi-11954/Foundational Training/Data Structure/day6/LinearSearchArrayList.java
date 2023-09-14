package com.gayathri.day6;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchArrayList {

	public static void main(String[] args) {
	
		ArrayList <Character> list = new ArrayList <Character> ();
		list.add('G');
		list.add('A');
		list.add('Y');
		list.add('A');
		list.add('T');
		list.add('H');
		list.add('R');
		list.add('I');
		list.add('D');
		list.add('E');
		list.add('V');
		list.add('I');
		System.out.println("The initial array list elements : "+list);
		
		System.out.print("\nEnter the charater to search : ");
		Scanner sc = new Scanner (System.in);
		char search =  sc.next().charAt(0);
		boolean isPresent = false;
		
		for(int i=0;i<list.size();i++) {
			if(search==list.get(i)) {
				System.out.println("\nThe Search element is present in index : "+i);
				isPresent=true;
				break;
			}
		}
	if(isPresent==false)
		System.out.println("\nThe search element is not present");

	sc.close();
	}

}
