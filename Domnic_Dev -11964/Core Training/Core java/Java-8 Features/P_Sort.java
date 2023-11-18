package Java8;

import java.util.Arrays;

public class P_Sort {

	public static void main(String[] args) {
		int []arr = { 10, 4, 6, 2, 1, 9, 7, 8, 3, 5 };
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

    int[] array = { 10, 4, 6, 2, 1, 9, 7, 8, 3, 5 };
   Arrays.parallelSort(array,1,4);
   
    for(int i=0;i<array.length;i++) {
   	System.out.print(array[i]+" ");
   }
    
    int[] arr3= {12,34,11,43,76,43,1};
    Arrays.parallelSort(arr3);
    
    for(int i=0;i<arr3.length;i++) {
    	System.out.print(arr3[i]);
    }

	}

}
