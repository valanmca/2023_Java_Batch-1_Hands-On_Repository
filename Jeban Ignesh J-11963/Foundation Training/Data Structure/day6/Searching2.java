package com.jeban.day6;
import java.util.ArrayList;
import java.util.Scanner;

public class Searching2 {

	public static void main(String[] args) {
		ArrayList<Character> list=new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		
		System.out.println("Enter the Character:");
		Scanner sc=new Scanner (System.in);
		char j=sc.next().charAt(0);
		
		boolean isPresent=false;
		for(char i=0; i<list.size(); i++) {
			if(j==list.get(i)) {
				System.out.println("Elements present in the list:"+i);
				isPresent=true;
				break;
			}
		}
		if(isPresent==false) {
			System.out.println("Element not present");
		}
		
		
		

	}

}
