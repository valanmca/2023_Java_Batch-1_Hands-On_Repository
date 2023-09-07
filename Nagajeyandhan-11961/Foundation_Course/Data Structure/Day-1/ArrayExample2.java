//Getting elements from the user in array

package com.jeyandhan.day01;
import java.util.*;
public class ArrayExample2 {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Intial Array Elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]); //printing the elements
		}
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter "+a.length+" values: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt(); //input elements
		}
		System.out.println("New Elements in the array are: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]); //printing the elements
		}
	}

}
