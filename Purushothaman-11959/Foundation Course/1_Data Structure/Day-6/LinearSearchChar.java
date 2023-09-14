package com.purushoth.day6;
import java.util.Scanner;
import java.util.ArrayList;

public class LinearSearchChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list=new ArrayList<Character>();
		/*list.add('A');
		list.add('R');
		list.add('S');
		list.add('L');
		list.add('M');*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Character: ");
		int a=sc.nextInt();
		System.out.println("The list values are: ");
		for (int i=0;i<a;i++) {
			int temp=sc.next().charAt(0);
			list.add((char)temp);
		}
		System.out.println(list);
		System.out.println("Enter the character to search: ");
		
		char k=sc.next().charAt(0);
		
		int search=0;
		for(int i=0;i<list.size();i++) {
			if(k==list.get(i)) {
				System.out.println("The element is present at index: "+i);
				search=1;
				break;
			}
		}
		if(search==0) {
			System.out.println("The element is not present");
		}
	}

}//To search character.
