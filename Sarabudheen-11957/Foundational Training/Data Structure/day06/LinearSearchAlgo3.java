/****** Linear Search Algorithm Using ArrayList (Strings)...  *****/
package com.sara.day06;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchAlgo3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String> ();
		
		list.add("Java");
		list.add("C");
		list.add("Python");
		list.add("C++");
		list.add(".Net");
		System.out.println(list);//[Java, C, Python, C++, .Net]
		
		System.out.println("Enter The String to Search : ");
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		
		boolean isPresent = false;
		for(int i=0; i<list.size();i++) {
			if (str.equals(list.get(i))) {
				System.out.println("The String Present in the index : "+ i);
				isPresent = true;
				break;
			}
		}
		
		if (isPresent == false) {
			System.out.println("The String is Not Present in the List");
		}
	}

}
