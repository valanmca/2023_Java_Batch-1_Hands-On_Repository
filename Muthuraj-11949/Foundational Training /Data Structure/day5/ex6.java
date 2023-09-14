package com.muthu.day5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class ex6 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	TreeMap<Integer, Integer>map=new TreeMap<Integer,Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size");
	int n = sc.nextInt();
	System.out.println("enter the elements:");
	for (int i = 0; i < n; i++) {
		list.add(sc.nextInt());	
			
		}
	
	System.out.println(list);
	
	
	for(int i=0;i<n;i++) {
		int count=0;
		int num=list.get(i);
		while(num!=0) {
			num=num/10;
			count++;
			

		}
		map.put(list.get(i), count);
		
		}
	
     System.out.println(map);
	}
}
