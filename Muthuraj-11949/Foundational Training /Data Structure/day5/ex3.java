package com.muthu.day5;
import java.util.Collections;
import java.util.TreeSet;
public class ex3 {
	public static void main(String[]args) {
		TreeSet<String> ts1=new TreeSet<String>(Collections.reverseOrder());//main area
		
		
		ts1.add("Hi");
		ts1.add("hello");
		ts1.add("o");
		ts1.add("java");
		ts1.add("Bye");
		
		System.out.println(ts1);
		
		TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder());
		ts.add(1);
		ts.add(1);
		ts.add(5);
		ts.add(7);
		ts.add(6);
		
		System.out.println(ts);

}
}
