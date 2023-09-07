package com.matthew.day01;

public class ArrayExample2 {
		//Second way of array declaration
	public static void main(String[] args) {
		int arr[] = new int[5];
		// we are allocating 5 memory location while runtime
		System.out.println("Initial array values (int) : ");
		for (int i=0;i<arr.length;i++ ) {
			System.out.println(arr[i]);
		}
		// string
		String coll[] = new String[5];
		System.out.println("Initial array values (str) : ");
		for (int i=0;i<coll.length;i++ ) {
			System.out.println(coll[i]);
		}
		// char
		char[] cha = new char[5];
		System.out.println("Initial array values (char) : ");
		for (int i=0;i<cha.length;i++ ) {
			System.out.println(cha[i]);
		}
	}

}
