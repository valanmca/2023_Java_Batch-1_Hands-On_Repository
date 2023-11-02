package com.core.day_13;

import java.util.ArrayList;
interface my{
	void display();
}

public class forEach {

	public static void main(String[] args) {
		ArrayList  <Integer> list= new ArrayList();

		list.add(10);
		list.add(20);
		list.add(130);
		list.add(40);
		System.out.println(list);
		
		list.forEach(name->System.out.println(name));
		
//  MyInterface sum=(a,b)->a+b;
//		
//		System.out.println("Addition:"+sum.calc(10,20));
		
//		lambda expression
		my lis=()->System.out.println("display");
		lis.display();
	}

}
