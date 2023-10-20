package com.jeban.Assignment4;

import java.util.Arrays;

interface Sortable{
	void sort(int[] array);
}

class QuickSort implements Sortable{
	public void sort(int[] array) {
		Arrays.sort(array);
		for(int i=array.length-1; i>=0;i--) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		
		
	}
}
class MergeSort implements Sortable{
	public void sort(int[] array) {
		Arrays.sort(array);
		for(int i=array.length-1; i>=0;i--) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		
	}
}

public class Sorting {

	public static void main(String[] args) {
		
		int[] array=new int[] {12,78,9,1,3};
		
		QuickSort quick=new QuickSort();
		quick.sort(array);
		System.out.println(" ");
		MergeSort merge=new MergeSort();
		merge.sort(array);
		
		

	}

}
