package DataStructureDay1;

import java.util.Scanner;

public class arrayfloat {

	public static void main(String[] args) {
        float arr[]= new float[5];
		
		System.out.println("Initial aray Elements are:");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter " + arr.length +"values");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextFloat();
		}
		System.out.println("New array Elements are:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}

	

	}

}
