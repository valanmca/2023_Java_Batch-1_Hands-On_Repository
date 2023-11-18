package Core_Topic_Domnic_Day_7;

import java.util.Arrays;
import java.util.Scanner;

interface Sortable {
	void sort(int[] array);
}

class QuickSort implements Sortable {
	public void sort(int[] array) {
		Arrays.sort(array);
		System.out.print("Quick sort =");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(" " + array[i]);
		}
	}
}

class MergeSort implements Sortable {
	public void sort(int[] array) {
		System.out.println();

		Arrays.sort(array);
		System.out.print("Merge sort =");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(" " + array[i]);
		}

	}
}

public class Assg_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuickSort obj = new QuickSort();
		System.out.println("QuickSort");
		System.out.println("Enter the size of array ");
		int num1 = sc.nextInt();
		int arr1[] = new int[num1];
		System.out.println("Enter " + num1 + " values");
		for (int i = 0; i < num1; i++) {
			arr1[i] = sc.nextInt();
		}
		obj.sort(arr1);

		MergeSort obj2 = new MergeSort();
		System.out.println("MergeSort");

		System.out.println("Enter the size of array");
		int num2 = sc.nextInt();
		int arr2[] = new int[num2];
		System.out.println("Enter " + num2 + " values");
		for (int i = 0; i < num2; i++) {
			arr2[i] = sc.nextInt();
		}
		obj2.sort(arr2);

	}

}