package com.matthew.day07;
import java.util.ArrayList;
import java.util.Scanner;
public class BubbleSortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int num = sc.nextInt();
		System.out.println("Enter the elements of array :");
		for(int i = 0;i<num;i++) {
			list.add(sc.nextInt());
		}
		for (int i = 0;i<num-1;i++) {
			for(int j = i+1;j<num;j++) {
				int a = list.get(i);	
				int b = list.get(j);
				if(a>b) {
					int temp = a;
					list.set(i, b);
					list.set(j,temp);
				}
			}
		}
		System.out.println(list);
	}

}
