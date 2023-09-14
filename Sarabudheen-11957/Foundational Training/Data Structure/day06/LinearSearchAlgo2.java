/***** Linear Search Algorithm Using ArrayList (Characters) ... *****/
package com.sara.day06;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchAlgo2 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character> ();
		
		list.add('B');
		list.add('E');
		list.add('A');
		list.add('S');
		list.add('T');
		System.out.println(list);
		
		System.out.println("Enter The Character to Search : ");
		Scanner sc = new Scanner (System.in);
		int character = sc.next().charAt(0);
		
		boolean isPresent = false;
		for(int i=0; i<list.size();i++) {
			if (character == list.get(i)) {
				System.out.println("The Character Present in the index : "+ i);
				isPresent = true;
				break;
			}
		}
		
		if (isPresent == false) {
			System.out.println("The Character is Not Present in the List");
		}
	}

}
