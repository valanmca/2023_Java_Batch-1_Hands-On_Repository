// Remove element using key

package com.jeyandhan.day05;

import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		// Inserting key and values
		tm.put('A', (int) 'A'); // storing the ASCII values and printing the corresponding alphabet.
		tm.put('C', (int) 'C');
		tm.put('B', (int) 'B');
		tm.put('D', (int) 'D');
		
		System.out.println(tm); //[{A=65, B=66,C=67, D=68}]
		
		System.out.println("A - ASCII value is: " + tm.get('A')); //Get a Specific value using key
		
		tm.remove('A'); // remove element using key
		System.out.println(tm); //[{B=66,C=67, D=68}]

	}

}
