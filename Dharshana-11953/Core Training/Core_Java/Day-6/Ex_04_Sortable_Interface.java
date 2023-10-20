//Write a Java program to create an interface Sortable with a method sort (int[] array) 
//that sorts an array of integers in descending order. Create two classes QuickSort and MergeSort 
//that implement the Sortable interface and provide their own implementations of the sort() method.

package com.dharshu.day6;

import java.util.Arrays;

interface sortable{
	void sort(int[] array);
}

class QuickSort implements sortable{
	public void sort(int[] array) {
		
		Arrays.sort(array);
		System.out.print("Quick Sort=");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(" "+array[i]+" ,");
		}
	}
}

class MergeSort implements sortable{
	public void sort(int[] array) {
		System.out.println();
		Arrays.sort(array);
		System.out.print("Merge Sort=");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(" "+array[i]+" ,");
		}
	}
}

public class Ex_04_Sortable_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort quick=new QuickSort();
		int arr[]= {5,4,3,6,7,8,12,13};
		quick.sort(arr);
		MergeSort merge=new MergeSort();
		int arr1[]= {9,8,7,4,5,6,1,2,3};
		merge.sort(arr1);
	}

}
