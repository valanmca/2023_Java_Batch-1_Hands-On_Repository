package DataStructureDay1;

import java.util.Scanner;

public class arraylargesmall {

	public static void main(String[] args) {
		int arr[]= new int[5];
		/*int arr[]= {20,30,50,70,10};*/
		
		System.out.println("Enter " + arr.length +"values");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
		   }
		}
		System.out.println(min);
		// TODO Auto-generated method stub

	
	}
}
/*arrays.sort(arr);*/

