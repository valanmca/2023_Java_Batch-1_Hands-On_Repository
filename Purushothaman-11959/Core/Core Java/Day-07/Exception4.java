package com.purushoth.day_07;

public class Exception4 {

	public static void main(String[] args) {
		System.out.println("Before Exception");//Execute
		int arr[]=new int[-5];//ArrayNegativeSizeException
		System.out.println("After Exception");//Didn't execute

	}

}
