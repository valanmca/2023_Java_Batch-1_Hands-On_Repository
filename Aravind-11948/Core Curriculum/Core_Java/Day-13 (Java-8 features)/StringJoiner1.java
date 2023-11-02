package com.core.day_13;

import java.util.StringJoiner;  
public class StringJoiner1 {

	public static void main(String[] args) {
		StringJoiner name=new StringJoiner(",");
		name.add("dom");
		name.add("dev");
		System.out.println(name);
		
		StringJoiner name1=new StringJoiner(",","[","]");
		name1.add("dom");
		name1.add("dev");
		System.out.println(name1);

	}

}
