package com.matthew.day06;
import java.util.Scanner;
import java.util.ArrayList;
public class ArraySearch {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		list.add('B');
		list.add('A');
		list.add('G');
		list.add('H');
		list.add('C');
		list.add('F');
		list.add('K');
		list.add('N');
		list.add('S');
		list.add('V');
		list.add('E');
		System.out.println(list);
		System.out.println("Enter the Character to search in the list : ");
		char name = sc.next().charAt(0);
		boolean isPresent = false;
		for (int i =0 ;i<list.size();i++) {
			if(name == list.get(i)) {
				System.out.println("The Character is present in the index : "+(i+1));
				isPresent = true;
				break;
			}
		}
		if (!isPresent) {
			System.out.println("The Character is not present in the list : ");
		}

	}

}
