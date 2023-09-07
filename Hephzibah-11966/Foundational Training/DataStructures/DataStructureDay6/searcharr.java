package DataStructureDay6;

import java.util.Scanner;

public class searcharr {

	public static void main(String[] args) {
		int arr[]= {10 ,8 ,5 ,6 ,2 ,4 ,20 ,18};
		
		System.out.println("enter the Element:");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		boolean isPresent=false;
		for(int i=0;i<arr.length; i++) {
			if(k==arr[i]) {
				System.out.println("element is present in the array:" +i);
				isPresent=true;
				break;
			}
			
		}
		if(isPresent==false) {
			System.out.println("Element is not Present in the array");
		}
		// TODO Auto-generated method stub

	}

}
