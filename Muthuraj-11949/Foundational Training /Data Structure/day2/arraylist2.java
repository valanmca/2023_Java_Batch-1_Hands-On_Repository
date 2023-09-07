package com.muthu.day2;
import java.util.ArrayList;
public class arraylist2 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();	
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);		
		list.set(1,25); //updates 
		System.out.println(list);//1
		
		
		System.out.println(list.get(1));//1

		
		System.out.println("Array the element are:");
		for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
		
		}
				
	}
}
		
