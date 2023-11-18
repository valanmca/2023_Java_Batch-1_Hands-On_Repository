package com.jeyandhan.day08;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckVsUnCheck {

	public static void main(String[] args) throws FileNotFoundException {

//		int a = 10/0; // ArithmeticException  ... UnChecked Exception
		
		FileReader fr = new FileReader("Demo.txt"); // FileNotFoundException ... Checked Exception

	}

}
