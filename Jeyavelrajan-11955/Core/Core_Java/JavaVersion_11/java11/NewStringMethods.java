package com.jeyavel.core.java11;

import java.util.stream.Stream;

public class NewStringMethods {

	public static void main(String[] args) {
		// is blank 
		
		String s1 ="";
		System.out.println(s1.isBlank());
		String s2 ="ophnbngbg";
		System.out.println(s2.isBlank());
		String s3 =" ";
		System.out.println(s3.isBlank());
		
		
		//line methods
		
		String str ="hi it is an java program\n this is string lines() method\rjava.lang.String.lines()";
		//for each with lambda
		
		Stream<String> strs=str.lines();
		strs.forEach(st->System.out.println(st));
		System.out.println("\n");
		
		//with method reference 
		Stream<String> strAns =str.lines();
		strAns.forEach(st->System.out.println());
		
		//repeat
		String a="java program ";
		String b=a.repeat(5);
		System.out.println(b);
		
		//strip
		
			String st="\t This is java strip() method \u2005";
			System.out.println(st);
			//Strip
			System.out.println(st.strip());//remove both sides 
			//strip
		    System.out.println(st.stripLeading());//remove front 
		    //stripTrailing
		    String sT="\t This is java stripTrailing()method\t";
		    System.out.println(sT.stripTrailing());//remove back 
		

	}

}
