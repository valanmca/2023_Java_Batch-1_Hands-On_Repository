package com.purushoth.day_06;

public class Try3 {

	public static void main(String[] args) {
		try {
			int arr[]= {12,16,10,8};
			System.out.println(arr[10]);
		}
       catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println(e);
       }
	}

}
