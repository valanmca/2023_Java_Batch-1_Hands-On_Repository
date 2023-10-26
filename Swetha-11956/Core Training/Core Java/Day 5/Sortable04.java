//Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array 
//of integers in descending order. Create two classes QuickSort and MergeSort that implement the
//Sortable interface and provide their own implementations of the sort() method.

package JavaOops5;

import java.util.Arrays;

interface Sortable{
	void sort(int[] array);
}
class QuickSort implements Sortable{
	public void sort(int[] array) {
		System.out.println("Quick sort");
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
			
	}
	
}
class MergeSort implements Sortable{
	public void sort(int[] array) {
		System.out.println("");
		System.out.println("Merge Sort");
		Arrays.sort(array);
		for(int i=array.length-1;i>=0;i--) {
            System.out.print(array[i]+" ");
		}
		
	}
	
}
public class Sortable04 {

	public static void main(String[] args) {
		QuickSort qs =new QuickSort();
		int[] arr= {4,8,0,2,1};
		qs.sort(arr);
		
		MergeSort ms=new MergeSort();
		int[] arr1= {8,5,0,1,7};
		ms.sort(arr1);
		

	}

}
