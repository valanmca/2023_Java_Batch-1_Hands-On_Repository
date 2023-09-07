package com.gayathri.day5;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {
		
		TreeSet <String> ts= new TreeSet <String> ();
		
		ts.add("sakthi");
		ts.add("vel");
		ts.add("Gayathri");
		ts.add("Devi");
		ts.add("sakt");
		//ts.add(null);//throw null poointer exception
		System.out.println(ts);

	}

}
