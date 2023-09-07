package com.swetha.day5;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Scanner;
public class DigCountTreeMap {

	public static void main(String[] args) {
		
		/*adding elements int the list and count the digits of each element,storing
		the list element as key and its corresponding digit count as key value in tree map*/
		
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		LinkedList<Integer>list=new LinkedList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int size=sc.nextInt();
		
		
		for(int i=0;i<size;i++) {
			int val=sc.nextInt();
			list.add(val);
		}
		System.out.println("The list elemnets are :"+list);
		
		
		for(int i=0;i<size;i++) {
		int count=0;
		int val=list.get(i);
		while(val!=0) {
			val=val/10;
			count++;
		}
		map.put(list.get(i),count);
		}
		System.out.println(map);
		

	}

}
