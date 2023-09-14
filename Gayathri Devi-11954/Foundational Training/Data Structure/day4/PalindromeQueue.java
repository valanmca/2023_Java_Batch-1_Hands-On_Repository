package com.gayathri.day4;

import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeQueue {

	public static void main(String[] args) {
		
		LinkedList <Integer> inputList = new LinkedList <Integer> ();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the size of the list : ");
		int size = sc.nextInt();
		
		System.out.println("\nEnter list values : ");
		for(int i=0;i<size;i++) {
			int get_number = sc.nextInt() ;
			inputList.add(get_number);
		}
		System.out.println("\nThe initial list : "+inputList);
		
		LinkedList <Integer> outputList = new LinkedList <Integer> ();

		boolean bool =false;
		int number2=0;
		
		for(int z=size-1;z>=0;z--) {
				number2 = inputList.get(z);
				outputList.add(number2);
		}
		System.out.println("\nThe palindrome list : "+outputList);
		
		for(int i=0;i<size;i++)
		{
				if(inputList.get(i)==outputList.get(i))
				{
					bool=true;
				}
				else
					bool=false;
		}
		if(bool==true)
			System.out.println("\nThe given list is palindrome list");
		else
			System.out.println("\nThe given list is not palindrome List");
		
sc.close();
	}

}
