package com.jeyavel.day6;
import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array values  No");
        int u_input= sc.nextInt();
        System.out.println("Enter the Array valuea are ");
        for(int i=0;i<u_input;i++) {
        	arr.add(sc.nextInt());
        	        	 
        }
        System.out.println("The Array values are "+arr);
        arr.sort(null);
        System.out.println("The sorted Array values are "+arr);
       
        
        System.out.println("Search no: ");
        int search=sc.nextInt();
        boolean flag = false;
        for(int i=0;i<u_input;i++) {
        int beg = i;
        int end = u_input - 1;
        int mid = (beg+end)/2;
        int k=arr.get(i);
        while(k==search) {
			System.out.println("Element Present in the index-> "+ i);
			flag = true;
		if(k>search) {
			beg = mid+1;
		}
		else if(k<search) {
			end = mid-1;
		}
        break;
        }
			
		}
        if(flag==false) {
        System.out.println("Element not Present ");
        }
		

	}

}
	

