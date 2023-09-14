package com.purushoth.day5;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<Integer> set=new TreeSet<Integer>(Collections.reverseOrder());
        TreeSet<String> set1=new TreeSet<String>(Collections.reverseOrder());
		
		set.add(20);//To add elements.
		set.add(10);
		set.add(25);
		
		set.add(5);
		set.add(15);
				
		System.out.println(set);//Elements are listed in ascending order(by default).
        		
		set1.add("Shaji");//To add elements.
		set1.add("Jenish");
		set1.add("Purushoth");
		set1.add("Muthu");
		set1.add("Sara");
		set1.add("Domnic");
		
		System.out.println(set1);
		
		set1.remove("Domnic");
		System.out.println(set1);
		
		
		

	}

}//To add integer and string in reverse order.(>>Collections.reverseOrder())
