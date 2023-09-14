package com.gayathri.day5;

import java.util.Scanner;
import java.util.TreeMap;

public class FactorialMap {

	public static void main(String[] args) {

		TreeMap<Integer, Integer> factMap = new TreeMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		// Factorial logic
		for (int n = 1; n <= 10; n++) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			factMap.put(n, fact);
		}
		System.out.println(factMap);
		System.out.println("0th index : "+factMap.get(0));
		System.out.println("5th index : "+factMap.get(5));//so treemap always depends on key, not for index
		System.out.println("\nFactorial of 5 : " + factMap.get(5));
		factMap.remove(6);// key vachu than remove pannanum.
		System.out.println("\nAfter Remove 6 : " + factMap);

		System.out.println("\nEnter any 1 - 10 number to find factorial :  ");
		int num = sc.nextInt();
		for(int i=0;i<=10;i++) {
			if(num==i) {
				bool=true;
			break;}
			else
				bool=false;
		}
		if(bool==false)
			System.out.println("\nThese kind of number not in map");
		else
			System.out.println("\nFactorial of given number  : " + factMap.get(num));
		
		sc.close();

	}

}
