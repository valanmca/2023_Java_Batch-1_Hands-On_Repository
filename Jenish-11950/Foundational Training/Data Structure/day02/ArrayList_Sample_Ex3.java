package com.jenish.day02;
import java.util.ArrayList;
public class ArrayList_Sample_Ex3 {

	public static void main(String[] args) {
ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);//[10,20,30,40,50]
		
		int sum = list.get(2) + list.get(3);
		System.out.println("Sum Of Index 2 and 3:" +sum);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			}
		list.add(0,sum);
		System.out.println("Insert Sum Of Value into Array at Index 0:" +sum);
		System.out.println(list);
		
		list.set(1, 100);//updates
		System.out.println(list);//[70, 100, 20, 30, 40, 50]
		
		//System.out.println( list.set(list.size( ) -1,100));

	}
}