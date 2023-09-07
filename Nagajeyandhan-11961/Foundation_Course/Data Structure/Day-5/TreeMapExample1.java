//Storing the ASCII values and printing the corresponding alphabet.

package com.jeyandhan.day05;

import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		// Inserting key and values
		tm.put('A', (int) 'A'); // storing the ASCII values and printing the corresponding alphabet.
		tm.put('D', (int) 'D');
		tm.put('B', (int) 'B');
		tm.put('@', (int) '@');
		tm.put('*', (int) '*');
		tm.put('a', (int) 'a');

		System.out.println(tm); // {A=65, B=66, C=67, D=68}
	}

}
