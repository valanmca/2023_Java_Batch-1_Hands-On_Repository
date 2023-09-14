package com.aravind.day5;

import java.util.TreeSet;

public class TreesetExmaple2 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("orange");
		ts.add("Apple");
		ts.add("Grapes");
		ts.add("Pineapple");
		ts.add("Aravind");// compare first letter and give output in alphabetic order
							// if first letter is same in two words then it checks the seconds the second
							// letter
							// [,Aapple,Aravind]
		// [,Aravind,apple]capital letter is first come in output;

		System.out.println(ts);

		// [Apple, Aravind, Grapes, Pineapple, orange]

	}

}
