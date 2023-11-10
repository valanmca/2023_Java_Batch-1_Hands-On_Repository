package com.madhan.lambda;

import java.util.StringJoiner;

public class S_Joiner {

	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner(",","{","}");
		sj1.add("Domnic");
		sj1.add("Purush");
		sj1.add("Shiva");
		sj1.add("Mathew");
		StringJoiner sj2 = new StringJoiner(" ", "[", "]");
		sj2.add("Dev");
		sj2.add("Thaman");
		sj2.add("Sankar");
		sj2.add("Bharath");
		StringJoiner merging=sj1.merge(sj2);
		System.out.println(merging);
		
}

}


