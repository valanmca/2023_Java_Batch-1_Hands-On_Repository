package com.purushoth.day_15;

import java.util.stream.Stream;

public class stringJava11 {

	public static void main(String[] args) {
		String str="Hello Let's";
		String str1="\t Let's begin";
		String str2="\t welcome \tto java";
		String str3="\t welcome \tto java\t";
		
		System.out.println("To is blank:");
		System.out.println(str.isBlank());
		
		System.out.println("To lines:");
		Stream<String> strs=str.lines();
		strs.forEach(st->System.out.println(st));
		
		System.out.println("To repeat:");
		System.out.println(str.repeat(2));
		
		System.out.println("To strip:");
		System.out.println(str1);
		System.out.println(str1.strip()); //To remove space in front and back and also center
		System.out.println(str3.strip());
		
		System.out.println("To stripleading:");
		System.out.println(str2);
		System.out.println(str2.stripLeading()); //To remove space in front
		
		System.out.println("To stringtrailing:");
		System.out.println(str3.stripTrailing());  //To remove space in back
		
        
	}

}
