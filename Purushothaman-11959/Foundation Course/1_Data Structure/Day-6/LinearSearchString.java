package com.purushoth.day6;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Sara");
		list.add("Jayanthan");
		list.add("Shaji");
		list.add("Domnic");
		list.add("Aravind");
		
		System.out.println(list);
		
		System.out.println("Enter the string to search: ");
		Scanner sc=new Scanner(System.in);
		String k=sc.next();
		int search=0;
		for(int i=0;i<list.size();i++) {
			if(k.equals(list.get(i))) {
				System.out.println("The element is present at index: "+i);
				search=1;
				break;
			}
		}
		if(search==0) {
			System.out.println("The element is not present");
		}


	}

}
