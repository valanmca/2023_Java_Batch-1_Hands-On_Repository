//Example for String_Joiner
package com.sara.CoreJava.Day_15;

import java.util.StringJoiner;

public class String_Joiner {

	public static void main(String[] args) {

		StringJoiner sj1 = new StringJoiner(","); //Joining the Strings with StingJoiner
		sj1.add("Rohit");
		sj1.add("Subman");
		sj1.add("Virat");
		sj1.add("KL");
		System.out.println(sj1);

		StringJoiner sj2 = new StringJoiner(",", "[", "]");//Joining the Strings with StingJoiner,Prefix and Suffix
		sj2.add("Rohit");
		sj2.add("Subman");
		sj2.add("Virat");
		sj2.add("KL");
		System.out.println(sj2);
		
		
	}

}
