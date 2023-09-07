package com.mahesh.ds_day2;

public class Sum_Array {

	public static void main(String[] args) {
		// byte arr[] = {10,20,30,40,50};   	--> format 1
		// byte arr1[] = new int[];				--> format 2
		// byte arr2[] = new int[]{1,2,3,4,5,6};--> format 3
		
		
		byte array[] =new byte[]{10,20,40,50};
		
		byte Sum = 0;
		for(int index=0;index<array.length;)
		{
			Sum= (byte) (Sum+array[index]);
			index++;
		}
		System.out.print("Sum of the given array[] : "+Sum);
	}

}
