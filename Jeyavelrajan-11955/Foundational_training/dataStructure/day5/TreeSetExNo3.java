

//to find adding the duplicate is accept in TreeSet or not  
package com.jeyavel.day5;

import java.util.TreeSet;

public class TreeSetExNo3 {

	public static void main(String[] args) {
TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Apple");
		ts.add("$Jeyavel");
		ts.add("Jeyanthan");
		ts.add("Levis");
		ts.add("Point");
		ts.add("Ball");
		ts.add("$Jeyavel");
		
		
		System.out.println("The TreeSet Elements");
		System.out.println(ts);

		
		
		//To remove the elements in the TreeSet use ts.remove 
		ts.remove("Levis");
		
		System.out.println("After removing Levis ");
		System.out.println(ts );
		
		

	}

	}


