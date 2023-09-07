//trying it in reverse order
package com.domnic.day5;

import java.util.TreeSet;
import java.util.Collections;
public class TreesetEx4 {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>(Collections.reverseOrder());
		ts1.add("Pursh");
		ts1.add("Muthurasu");
		ts1.add("Jeban");
		ts1.add("Ignesh");
		ts1.add("Sara");                     
		ts1.add("Shaji");
		ts1.add("Jeban");
		System.out.println(ts1);
		
		System.out.println();

		TreeSet<Integer> ts = new TreeSet<Integer>(Collections.reverseOrder());
        ts.add(83);
        ts.add(52);
        ts.add(67);
        ts.add(32);
        ts.add(21);
        ts.add(52);//ignore duplicate value
        System.out.println(ts);
	}

}
