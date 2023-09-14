package com.madhan.day05;
import java.util.TreeSet;
import java.util.Collections;
public class TreesetExample4 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder());
		ts.add(10);
		ts.add(40);
		ts.add(200);
		ts.add(40);
		ts.add(70);
		ts.add(10000);
		ts.add(40);
		
		System.out.println(ts); //[10000,200,70,40,10] --> Descending order
		}

}
