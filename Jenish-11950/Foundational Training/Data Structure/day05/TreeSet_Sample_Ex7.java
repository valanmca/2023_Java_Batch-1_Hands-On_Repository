package com.jenish.day05;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.TreeSet;
public class TreeSet_Sample_Ex7 {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> map1 = new TreeMap<Integer,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the elements");
		int num = sc.nextInt();
		System.out.println("Enter the Values");
		for(int i=0; i<num; i++) {
			int a=sc.nextInt();
			list.add(a);
		}
		System.out.println(list);
		for(int i=0; i<num; i++) {
			int increment=0;
			int n=list.get(i);
			
			while(n!=0) {
				n=n/10;
				increment++;
			
			}
			list1.add(increment);
			System.out.println(list1);
			
				
		}
		
		
		for(int i=0; i<list.size();i++) {
			map1.put(list.get(i), list1.get(i));
		}
		System.out.println(map1);
		
		
		sc.close();
		}

}
