package com.mahesh.ds_day5;

import java.util.Collections;
import java.util.TreeSet;

public class Tree_Int_Reverse {

	public static void main(String[] args) {
		TreeSet<Integer> numbers =new TreeSet<Integer>(Collections.reverseOrder());
		//tree sort the values based on ASCII
		//Using Collections.reverseOrder() we can change Treeset as decending orderwise
		numbers.add(0);//[0]
		numbers.add(8);//[8,0]
		numbers.add(4);//[8,4,0]
		numbers.add(9);//[9,8,4,0]
		numbers.add(-1);//[9,8,4,0,-1]
	
		System.out.println(numbers);//[9, 8, 4, 0, -1]

	}

}
