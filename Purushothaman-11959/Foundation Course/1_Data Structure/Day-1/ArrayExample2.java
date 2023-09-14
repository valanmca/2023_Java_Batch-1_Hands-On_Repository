package com.purushoth.day1;
import java.util.Scanner;
public class ArrayExample2 {

	public static void main(String[] args) {
	    float arr2[]=new float[5];
		System.out.println("Array Values: ");
		for (float i=(float)0.0;i<arr2.length;i++) {
			System.out.println(arr2[(int)i]);
		}
		int arr1[]=new int[5];
			System.out.println("Array Values: ");
			for (int i=0;i<arr1.length;i++) {
				System.out.println(arr1[i]);
		}
			Scanner sc = new Scanner(System.in);
            System.out.println("The size of array is: "); 
            int a=sc.nextInt();
			int arr[]=new int[a];
			System.out.println("Enter "+arr.length+" values:" );
			for (int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Array Values: ");
			for (int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
	}

}
}
