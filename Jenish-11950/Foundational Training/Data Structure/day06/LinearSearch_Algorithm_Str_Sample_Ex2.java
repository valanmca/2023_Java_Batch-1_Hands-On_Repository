package com.jenish.day06;

import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearch_Algorithm_Str_Sample_Ex2 {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("Bus");
		list.add("Eye");
		list.add("Apple");
		list.add("Finger");
		list.add("Hike");
		list.add("Kite");
		System.out.println("Enter the Character to Search:");
		Scanner sc= new Scanner (System.in);
		String s=sc.next();
		boolean isPresent = false;
		for(int i=0; i<list.size(); i++) {
			if(s.equals(list.get(i))) {
				System.out.println("Elements present in the index:" +i);
				isPresent=true;
				break;
	}

}
		if(isPresent==false)
			System.out.println("Enter not Present");
		sc.close();


	}

}
