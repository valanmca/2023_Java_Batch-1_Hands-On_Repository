//Linear Search using ArrayList

package com.jeyandhan.day06;

import java.util.ArrayList;

import java.util.Scanner;

public class LinearSearchArrayList {

	public static void main(String[] args) {
		ArrayList<Character> list= new ArrayList<Character>();
		
		list.add('A');
		list.add('D');
		list.add('G');
		list.add('X');
		list.add('E');
		list.add('N');
		
		System.out.println(list);
		
		System.out.println("Enter the Character to Search: ");
		Scanner sc = new Scanner(System.in);
		
		char search = sc.next().charAt(0);
		
		boolean isPresent = false;
		for(int i=0;i<5;i++) {
			if(search==list.get(i)) {
				System.out.println("Element Present in the index: "+i);
				isPresent = true;
				break;
			}
		}
		if(!isPresent) {
			System.out.println("Element is Not present in the list");
		}

	}

}
