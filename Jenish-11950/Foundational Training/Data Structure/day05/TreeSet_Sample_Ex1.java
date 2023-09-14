package com.jenish.day05;
import java.util.TreeSet;

public class TreeSet_Sample_Ex1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(90);
		ts.add(70);
		ts.add(50);
		ts.add(60);
		ts.add(80);
		
		System.out.println("Values:" +ts);//Elements Displays in Number Ascending order
	}

}
