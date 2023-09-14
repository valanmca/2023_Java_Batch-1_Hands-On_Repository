package com.dharshu.day6;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchArrayList {

	public static void main(String[] args) {
		ArrayList<Character> arrlist=new ArrayList<Character>();
		
		arrlist.add('D');
		arrlist.add('H');
		arrlist.add('A');
		arrlist.add('R');
		arrlist.add('S');
		arrlist.add('H');
		arrlist.add('U');
		
		System.out.println("The Elements in an arraylist is:"+arrlist);
		
		System.out.println("Enter the character to Search:");
		Scanner sc=new Scanner(System.in);
		char d=sc.next().charAt(0);
		
		boolean isPresent=false;
		for(int i=0;i<arrlist.size();i++) {
			if(d==arrlist.get(i)) {
				System.out.println("The Search element is present in the index:"+i);
				isPresent=true;
				break;
			}
		}
		
		if(isPresent==false)
			System.out.println("The element is not Present!!!");
	}

}
