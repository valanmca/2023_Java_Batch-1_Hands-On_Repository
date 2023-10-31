package com.purushoth.day_07;

public class Exception2 {

	public static void main(String[] args) {
		System.out.println("Before Exception");//Execute
        int a=Integer.parseInt("abc");//Runtime error NumberFormatException
        System.out.println("After Exception");
	}

}
