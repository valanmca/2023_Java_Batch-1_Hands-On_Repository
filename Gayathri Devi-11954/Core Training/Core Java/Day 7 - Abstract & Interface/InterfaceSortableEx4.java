package com.gayathri.day6;
/*
 * Write a java program to create an interface Sortable with a method sort(int [] array) that sorts an array of integers in descending order.
 * Create two class quicksort and mergesort that implement the sortable interface and provide their own implementations of the sort() method.
 */
interface Sortable{
	void sort();
}
class QuickSort implements Sortable{
	public void sort() {
		System.out.println("QuickSort");
	}
	
}
class MergeSort implements Sortable{
	public void sort() {
		System.out.println("MergeSort");
	}
}
public class InterfaceSortableEx4 {

	public static void main(String[] args) {
		Sortable ref = new QuickSort();
		ref.sort();
		Sortable refer = new MergeSort();
		refer.sort();

	}

}
