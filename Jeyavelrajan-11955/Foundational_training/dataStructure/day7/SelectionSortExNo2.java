
//
package com.jeyavel.day7;

import java.util.LinkedList;

public class SelectionSortExNo2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();//Declaration

		list.add(10);
		list.add(34);
		list.add(23);
		list.add(53);
		list.add(12);
		list.add(79);

		for (int i = 0; i < list.size(); i++) {
			int instMax = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(instMax) < list.get(j)) {// to get the index Elements/values and compare 
					instMax = j;
				}
			}
			int k=list.get(instMax);//To get the the values in  i through instMax 
			int temp = list.get(i);
			list.set(i,k);
			list.set(instMax,temp);

		}

		
			System.out.println("The Selection Sort in Linked List is" + list);
		}

	}

