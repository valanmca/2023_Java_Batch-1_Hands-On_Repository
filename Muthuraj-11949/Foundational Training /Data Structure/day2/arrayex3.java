package com.muthu.day2;
import java.util.ArrayList;
public class arrayex3 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
	
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);//add array in index
		
		int Sum= list.get(2)+list.get(3);//sum of two index

		System.out.println("SUM OF INDEX 2 AND 3:" +Sum);
		for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
		}
		list.set(0,70); //insert the value in index
		System.out.println(list);//1
		
	}
}