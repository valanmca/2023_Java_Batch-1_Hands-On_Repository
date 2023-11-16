package com.mahesh.core_java_day_16_V8;

import java.util.StringJoiner;

public class StringJointExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner sj = new StringJoiner(" ");
		sj.add("Domnic");
		sj.add("Mahesh");
		System.out.println(sj);

		StringJoiner SjObj = new StringJoiner(",","[","]");
		SjObj.add("Dev");
		SjObj.add("kumar");
		System.out.println(SjObj);
		
		
	}

}
