//Add elements in TreeMap (Interger)

package com.jeyandhan.day05;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String>  tm = new TreeMap<Integer, String>();
		//Inserting key and values
		tm.put(10, "Java");
		tm.put(25,"C");
		tm.put(3, "C++");
		tm.put(40, "Python");
		
		System.out.println(tm); //[3 C++, 10 Java, 25 C, 40 Python]
		
		tm.put(3, "PHP"); //update the value in the specified key
		System.out.println(tm); //[3 PHP, 10 Java, 25 C, 40 Python]
	}

}
