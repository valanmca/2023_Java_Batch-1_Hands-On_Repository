package com.mahesh.ds_day1;

public class Array_Print {

	public static void main(String[] args) {
		
		int ARRAY[]= {10,20,30,40,50,60,70,80,90,100,99,88,77,66,55,44,33,22,11};

		System.out.println("ARRAY is First index"+ARRAY[0]);
		System.out.println("ARRAY is Last index"+ARRAY[ARRAY.length-1]);
		//System.out.println(ARRAY[length]);
		ARRAY[0] =10;//UPDATE THE VALUE
		//System.out.println(ARRAY[0]);
		
		
		for(int i=0;i<ARRAY.length;)
			
		{
			System.out.println("index is : "+i);
			System.out.println("value is : "+ARRAY[i]+"\n");
			i++;
		}
		
	}

}
