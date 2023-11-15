package com.shiva.core.day14;

public class Strip_Method {

	public static void main(String[] args) {

		String st = "\t This is Java String";
		System.out.println(st);

		// To remove the Spaces in front
		System.out.println(st.strip());
		System.out.println("----------------------------------");
		String st1 = "\t This is Java String \t type";
		System.out.println(st1);

		System.out.println(st1.stripLeading());
	}

}
