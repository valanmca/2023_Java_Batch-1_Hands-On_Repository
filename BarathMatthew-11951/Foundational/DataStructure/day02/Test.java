package com.matthew.day02;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the List range : ");
		int len = sc.nextInt();
		for (int i = 0; i<len;i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}
		System.out.println(list);
		for (int i =0;i<list.size();i++) {
			list.set(i,i++);
		}
		System.out.println(list);
	}

}
