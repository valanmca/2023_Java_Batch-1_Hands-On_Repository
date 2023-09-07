package com.swetha.day5;
import java.util.Collections;
import java.util.TreeSet;
public class DescendingTs {

	public static void main(String[] args) {
		
		
		//Prints in descending order.....using collections.reverseOrder...
		TreeSet<Integer> tree=new TreeSet<Integer>(Collections.reverseOrder());
		TreeSet<String> tree1=new TreeSet<String>(Collections.reverseOrder());
		
		//Adding elements in the TreeSet
				tree.add(8);
				tree.add(5);
				tree.add(3);
				tree.add(1);
				tree.add(7);
				
				//Prints in Descnding order
				
				System.out.println("The tree set in integer : "+tree);
				
				
				//Creating TreeSet using String
				tree1.add("banyan");
				tree1.add("apple");
				tree1.add("orange");
				tree1.add("banana");
				
				//Print the elements in Ascending order by comparing all the values
				System.out.println("The treeSet string : "+tree1);
				
				
				
	}

}
