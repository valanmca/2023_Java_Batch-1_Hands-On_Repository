package com.jenish.assignment;
//find sum and average of all elements in an array
//To search key elements in an array
//To count the number of occurrence of an elements in an array
public class Assignment_3 {

	public static void main(String[] args) {
		 int[]arr= {11,12,13,14,15};
		 int sum=0;
		 for(int i=0; i<arr.length;i++) {
			 sum+=arr[i];
		 } 
		 double average=(double)sum/arr.length;
		 
		 System.out.println("Sum: "+sum);
		 System.out.println("Average: "+average);

	}

}
