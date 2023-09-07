package com.swetha.day6;
import java.util.LinkedList;
import java.util.Scanner;
public class LinListStringSearch {

	public static void main(String[] args) {
		
		//Searching a string in linked list.
		LinkedList<String> list=new LinkedList<String>();
		
		list.add(".NET");
		list.add("C");
		list.add("C++");
		list.add("JAVA");
		list.add("PHP");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string to search");
		String val=sc.next();
		
		boolean isPresent=false;
		for(int i=0;i<list.size();i++) {
			if(val.equals(list.get(i))) {
				System.out.println("The searching String at the index :"+i);
				isPresent=true;
				break;
			}
		}
		if(isPresent==false) {
        	System.out.println("String is not present");
        }
		
		

	}

}
