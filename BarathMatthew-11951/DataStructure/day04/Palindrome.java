package com.matthew.day04;
import java.util.Scanner;
import java.util.LinkedList;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		System.out.println("Enter the size of the List : ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}
		System.out.println(list);
		for(int i=1;i<=num;i++) {
			list1.add(list.get(num-i));
		}
		System.out.println(list1);
		boolean result = true;
		for(int i=0;i<list.size();i++) {
			if (list.get(i) == list1.get(i)) {
				continue;
			}
			else {
				System.out.println("Not Palindrome");
				result = false;
				break;
			}
		}
		if (result) {
			System.out.println("Palindrome");
		}
	}

}
