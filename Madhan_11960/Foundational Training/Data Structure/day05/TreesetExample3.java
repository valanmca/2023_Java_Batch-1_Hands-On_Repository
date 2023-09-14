package com.madhan.day05;
import java.util.TreeSet;

public class TreesetExample3 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(40);
		ts.add(200);
		ts.add(40);
		ts.add(70);
		ts.add(10000);
		ts.add(40);
		ts.remove(10);
		
//		 If we give duplicate values ,it takes only one value, also
//		it will not show any error.
		
		System.out.println(ts); 

	}

}
