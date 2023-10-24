package com.purushoth.day_05;

import java.util.Arrays;

interface Sortable{
	void sort(int[] array);
}

class QuickSort implements Sortable{
	public void sort(int[] array) {  
		Arrays.sort(array);
		System.out.println("The QuickSorted array in descending: ");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(+array[i]+" ");
		}
	}
}

class MergeSort implements Sortable{
	public void sort(int[] array1) {
		Arrays.sort(array1);
		System.out.println(" ");
		System.out.println("The MergeSorted array in descending: ");
		for(int i=array1.length-1;i>=0;i--) {
			System.out.print(array1[i]+" ");
		}
	}
}
public class SortMethod {

	public static void main(String[] args) {
		QuickSort qs=new QuickSort();
		int array[]= {8,3,6,2,1};
		qs.sort(array);
		MergeSort ms=new MergeSort();
		int array1[]= {7,13,9,4,2};
		ms.sort(array1);
		}
}
