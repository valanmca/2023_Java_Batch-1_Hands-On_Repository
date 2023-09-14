package com.jeban.day5;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.ArrayList;


public class TreeMap7 {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size:");
		int number=sc.nextInt();
		System.out.println("Enter the number:");
		for(int i=0; i<number; i++) {
			list.add(sc.nextInt());
			
		}
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			int count=0;
			int n=list.get(i);
			while(number!=0) {
				number=number/10;
				count++;
				}
			map.put(list.get(i), count);
				
	
	}
		System.out.println(map);

}
}