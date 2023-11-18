//Lambda Expression Examples

package com.sara.CoreJava.Day_15;

import java.util.ArrayList;

public class LambdaExpression {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Sara");
		list.add("Virat");
		list.add("Kohli");
		list.add("Abde");
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
