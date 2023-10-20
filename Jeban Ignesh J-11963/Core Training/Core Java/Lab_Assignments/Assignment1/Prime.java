package com.jeban.LabAssignment;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		ArrayList<Integer> coll = new ArrayList<Integer>();
		int i = 2;
		int count = 0;
		while (coll.size() != 10) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				coll.add(i);
			}
			count = 0;
			i++;
		}

		System.out.println(coll);
		int sum = 0;
		for (int j = 0; j < coll.size(); j++) {
			sum += coll.get(j);
		}
		System.out.println("Sum : " + sum);

	}

}
