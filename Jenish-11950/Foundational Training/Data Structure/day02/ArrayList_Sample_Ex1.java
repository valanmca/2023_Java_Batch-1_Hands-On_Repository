package com.jenish.day02;
import java.util.ArrayList;

public class ArrayList_Sample_Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Size:" +list.size());//0
		System.out.println(list);
		
		list.add(10);//adding an element at the end
		System.out.println("Size:" +list.size());//1
		
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Size:" +list.size());//4
		System.out.println(list);
		
		list.remove(2);//removing by using index
		System.out.println("Size:" +list.size());//3
		System.out.println(list);//[10,20,40]
		
		list.add(1,55);//inserting element in the middle with the help of index
		System.out.println("Size:" +list.size());//4
		System.out.println(list);//[10,55,20,40]
		
		list.remove(1);//removing  55
		System.out.println("Size:" +list.size());//3
		System.out.println(list);//[10,20,40]
		
		list.remove(0);//removing by using index
		System.out.println("Size:" +list.size());//3
		System.out.println(list);//[10,20,40]
	}

}
