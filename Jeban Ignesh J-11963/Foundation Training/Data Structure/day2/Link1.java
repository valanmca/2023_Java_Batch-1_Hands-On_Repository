package com.jeban.day2;
import java.util.ArrayList;
import java.util.LinkedList;

public class Link1 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println("Size:" +list.size());
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("List:"+list);
		
		list.add(1,78);
		System.out.println("List:" +list);
		
		list.set(3,89);
		System.out.println("List:"+list);
		
		list.remove(3);
		System.out.println("List:" +list);
		
		int sum=0;
		sum=list.get(4)+list.get(3);
		System.out.println("Sum:" +sum);
		
		int avg=0;
		avg=list.size();
		System.out.println(avg);
		
		System.out.println("The elements:"+ list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
			
		
		
		
		
	
	
	}

}
