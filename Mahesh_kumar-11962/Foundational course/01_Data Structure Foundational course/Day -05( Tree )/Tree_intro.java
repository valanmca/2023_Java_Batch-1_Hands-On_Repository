package com.mahesh.ds_day5;
import java.util.TreeSet;
public class Tree_intro {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts =new TreeSet<Integer>();
		//tree don't add duplicate values
		System.out.println("Input");
		ts.add(9);
		ts.add(0);
		ts.add(4);
		ts.add(7);
		ts.add(0);
		ts.add(0);
		ts.add(3);
		ts.add(8);
		System.out.println(ts);//[0, 3, 4, 7, 8, 9]
		//tree display the value as ascending order
		ts.add(-11);
		ts.add(-755);
		System.out.println("Output");
		System.out.println(ts);//[-755, -11, 0, 3, 4, 7, 8, 9]
	}

}
