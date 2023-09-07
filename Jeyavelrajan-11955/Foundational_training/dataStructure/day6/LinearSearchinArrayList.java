package com.jeyavel.day6;
import java.util.ArrayList;
//using character 
import java.util.Scanner;

public class LinearSearchinArrayList {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('J');
		list.add('E');
		list.add('Y');
		list.add('A');
		list.add('V');
		list.add('E');
		list.add('L');
		System.out.println("list Elements Are ->"+list );
		@SuppressWarnings("resource")
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the character to Find");
		char ch = sc.next().charAt(0);
		
		boolean flag = false;
		for(int i=0;i<list.size();i++) {
			if(ch==list.get(i)) {
				System.out.println("Character is Present->"+(i+1));
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element is Not Present");
		}

	}

}
