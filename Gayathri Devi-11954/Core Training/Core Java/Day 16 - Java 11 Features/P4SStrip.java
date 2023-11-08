package com.gayathri.day16Java11Features;

public class P4SStrip {

	public static void main(String[] args) {

		String st = "\t This is Java String stripLeading() method \u2005";
		System.out.println(st);
		//System.out.println(st.strip());//both space removed
		System.out.println(st.stripLeading()); //last space not removed
		//System.out.println(st.stripTrailing()); //first space not removed

		System.out.println("\n");
		String str = " Hello ";
		System.out.println(str);
		System.out.println(str.strip());
		
		System.out.println("\n");
		String str1 = "Hello ";
		System.out.println(str1);
		System.out.println(str1.strip());
		
		System.out.println("\n");
		String str2 = " Hello";
		System.out.println(str2);
		System.out.println(str2.strip());
		
		System.out.println("\n");
		String str3 = " Hello world ";
		System.out.println(str3);
		System.out.println(str3.strip());
		
		String str5 = "\t    Manish    \u2005";
		System.out.println(str5);
		System.out.println(str5.strip());

	}

}
