package com.gayathri.day8Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Exception handling sample program
//try & catch = keywords
public class SampleThows11 {

	void m1() throws ArithmeticException, FileNotFoundException {
		// business logic
		int a = 10 / 0; // Arithmetic Exception - Unchecked Exception
		FileReader fr = new FileReader("Dem.txt"); // filenotfoundexception - checked
	}

	void m2() { // Exception handling code
		try {
			m1();
		} catch (ArithmeticException e) {

		} catch (FileNotFoundException e) {

		}

	}

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Throws");

		System.out.println("\nBefore Exception");

		FileReader fr = new FileReader("Demo.txt"); // filenotfoundexception - checked

	}

}
