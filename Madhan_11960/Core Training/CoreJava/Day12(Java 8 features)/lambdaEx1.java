package com.madhan.lambda;

import java.util.ArrayList;

public class lambdaEx1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Madhan");
		list.add("Jeyandhan");
		list.add("Purushoth");
		list.add("Siva");
//		System.out.println(list);
//		printName(list);
		
		list.forEach((name) -> System.out.println(name));
		
	}
	
//	private static void printName(ArrayList<String> list)
//	{
//		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
//	}

}
