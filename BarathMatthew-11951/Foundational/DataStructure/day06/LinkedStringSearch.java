package com.matthew.day06;
import java.util.Scanner;
import java.util.LinkedList;
public class LinkedStringSearch {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words to present in the list:");
		Boolean toContinue = true;
		while (toContinue) {
			String temp = sc.next();
			if (temp.equals("end")) {
				toContinue = false;
			}
			else {
				list.add(temp);
			}
		}
		System.out.println("Enter a word : ");
		String name = sc.next();
		boolean isPresent = false;
		for(int i =0;i<list.size();i++) {
			if( name.equals(list.get(i))){
				System.out.println("The word is present in the index of : "+i);
				isPresent = true;
				break;
			}
		}
		if(!isPresent) {
			System.out.println("The word is not present in the list : ");
		}
	}

}
