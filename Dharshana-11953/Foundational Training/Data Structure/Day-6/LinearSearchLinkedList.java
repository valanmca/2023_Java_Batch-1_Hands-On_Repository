package com.dharshu.day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearchLinkedList {

	public static void main(String[] args) {
		LinkedList<String> strlist=new LinkedList<String>();
		
		strlist.add("D");
		strlist.add("H");
		strlist.add("A");
		strlist.add("R");
		strlist.add("S");
		strlist.add("H");
		strlist.add("U");
		
		System.out.println("The Elements in an arraylist is:"+strlist);
		
		System.out.println("Enter the character to Search:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		//strlist.add(s1);
		boolean isPresent=false;
		
		for(int i=0;i<strlist.size();i++) {
			if(s1.equals(strlist.get(i))) {
				System.out.println("The Search element is present in the index:"+i);
				isPresent=true;
				break;
			}
		}
		
		if(isPresent==false)
			System.out.println("The element is not Present!!!");
		sc.close();
	}


}

