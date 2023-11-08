package com.dharshu.day14;

import java.util.StringJoiner;

public class Merging_String {

	public static void main(String[] args) {
		StringJoiner sj1= new StringJoiner(" , ","{","}");
		sj1.add("Dharshu");
		sj1.add("Alagar");
		sj1.add("Kavi");
		sj1.add("Kavin");
		
		StringJoiner sj2= new StringJoiner(" ","[","]");
		sj2.add("Minion");
		sj2.add("Kabil");
		sj2.add("Sathya");
		sj2.add("Karthic");
		
		StringJoiner merging=sj1.merge(sj2);
		System.out.println(merging);
	}

}
