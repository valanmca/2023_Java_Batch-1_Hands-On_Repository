package com.swetha.day6;
import java.util.Scanner;
import java.util.ArrayList;
public class LinSearchCharacter {

	public static void main(String[] args) {
		
		//Linear search using Character
		ArrayList<Character>list=new ArrayList<Character>();
		list.add('A');
		list.add('C');
		list.add('S');
		list.add('H');
		list.add('D');
		
		System.out.println("Enter a character to Search :");
		Scanner sc=new Scanner(System.in);
		char k=sc.next().charAt(0);          //Getting a character input
		
		boolean isPresent=false;
		for(int i=0;i<list.size();i++) {
			if(k==list.get(i)) {
				System.out.println("The searching character at the index :"+i);
				isPresent=true;
				break;
			}
		}
		if(isPresent==false) {
        	System.out.println("Element is not present");
        }
		
		

	}

}
