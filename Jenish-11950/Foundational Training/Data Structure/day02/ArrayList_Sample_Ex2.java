package com.jenish.day02;
import java.util.ArrayList;
public class ArrayList_Sample_Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);//[10,20,30,40]
		
		list.set(1, 25);//updates
		
		System.out.println(list);//[10, 25, 30, 40]
		
		System.out.println(list.get(1));//25
		
		System.out.println("Array list Elements are:");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		

	}

}
