package com.naveen.day_13;

import java.util.StringJoiner;

public class Ex03_StringJoiner {

	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner(",");
		sj1.add("Domnic");
		sj1.add("Purush");
		sj1.add("Shiva");
		sj1.add("Mathew");
		
		StringJoiner sj2 = new StringJoiner(" ","[", "]");
		sj2.add("Domnic");
		sj2.add("Purush");
		sj2.add("Shiva");
		sj2.add("Mathew");
		
		
	}

}
