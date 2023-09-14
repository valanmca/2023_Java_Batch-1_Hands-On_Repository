package com.purushoth.day2;
import java.util.LinkedList;

public class Linked_List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list =new LinkedList<Integer>();
		
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println(list);
		
		list.add(1,25);//To insert at the location
		System.out.println(list);
		
		list.set(1, 100);//To replace
		System.out.println(list);
		
		list.remove(1);// To remove (index value)
		System.out.println(list);
		
		System.out.println(list.size());//For size
		
		for(int i=0; i<list.size();i++) {//For traversal
			System.out.println(list.get(i));
		}
			LinkedList<String> list1 =new LinkedList<String>();

			list1.add("C");
			list1.add("JAVA");
			list1.add("PYTHON");
			list1.add("C++");
			System.out.println(list1);
			
			list1.add(1,"MySql");//To insert at the location
			System.out.println(list1);
			
			list1.set(1, ".NET");//To replace
			System.out.println(list1);
			
			list1.remove(1);// To remove (index value)
			System.out.println(list1);
			
			System.out.println(list1.size());//For size
			for(int i=0; i<list1.size();i++) {//For traversal
				System.out.println(list1.get(i));
		}
		

	}

	}
