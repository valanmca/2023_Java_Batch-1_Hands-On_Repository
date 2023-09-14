package com.matthew.day05;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;
public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>(Collections.reverseOrder());
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int temp = 1;
		for (int i = 1;i<=num;i++) {
			temp*=i;
			map.put(i, temp);
		}
		System.out.println(map);
		System.out.println("Factorial of 5:"+map.get(5));
		map.remove(5);
		System.out.println(map);
	}
}
