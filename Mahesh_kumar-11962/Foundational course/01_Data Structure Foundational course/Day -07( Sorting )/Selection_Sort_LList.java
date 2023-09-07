package com.mahesh.ds_day7;

import java.util.LinkedList;
import java.util.Scanner;

public class Selection_Sort_LList {

	public static void main(String[] args) {
		int size;
		System.out.println(" Enter the array size :");
		try (Scanner scanner = new Scanner(System.in)) {
			size = scanner.nextInt();
			// int array[] = new int[size];
			LinkedList<String> lls = new LinkedList<String>();
			System.out.println("Enter your inputs : ");
			for (int index = 0; index < size; index++) {
				lls.add(scanner.next());
			}

			System.out.println("list elements before sorting :\n" + lls);

			for (int index = 0; index < size; index++) {
				int min_val = index;
				for (int Sindex = index + 1; Sindex < size; Sindex++) {
					if (lls.get(min_val).compareTo(lls.get(Sindex)) > 0) {
						min_val = Sindex;
					}

				}

			
				String m_val = lls.get(min_val);

				String temp = lls.get(index);
				lls.set(index, m_val);
				lls.set(min_val, temp);

			}
			System.out.println("\nAfter Sorting:\n" + lls);
		}

	}

}
