package com.core.day_06;
import java.util.Arrays;

interface Sortable{
	void sort( int [] array);
}

class QuickSort implements Sortable
{
	public void sort(int [] array){
		  Arrays.sort(array);
		  
		  System.out.print("Quick sort =");
		  for(int i=array.length-1;i>=0;i--)
		  {
			  System.out.print(" "+array[i]+",");
		  }
	}
}

class MergeSort implements Sortable
{
	public void sort(int [] array){
		System.out.println();
		
		 Arrays.sort(array);
		  System.out.print("Merge sort =");
		  for(int i=array.length-1;i>=0;i--)
		  {
			  System.out.print(" "+array[i]+",");
		  }
		
	}
}

public class Ass_4 {

	public static void main(String[] args) {
		QuickSort obj=new QuickSort();
		int arr[]= {5,4,3,6,7,8,12,3};
		obj.sort(arr);
		MergeSort obj1=new MergeSort();
		int arr1[]= {9,8,7,6,5,4,3,2,1};
		obj1.sort(arr1);
		

	}

}
