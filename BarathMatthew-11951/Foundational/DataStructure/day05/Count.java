package com.matthew.day05;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
public class Count {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>(); 
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the List: ");
		int range = sc.nextInt();
		System.out.println("Enter the Elements :");
		for (int i = 0;i<range;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		for (int i =0;i<list.size();i++) {
			int value = list.get(i);
			int count = 0;
			while(value !=0) {
				count++;
				value /=10;
			}
			map.put(list.get(i), count);
		}
		System.out.println(map);
	}

}
