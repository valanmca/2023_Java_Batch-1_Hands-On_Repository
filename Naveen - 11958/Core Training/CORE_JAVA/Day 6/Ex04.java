package com.naveen.day6;

// Use of throws keyword
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex04 {
	void m1() throws ArithmeticException, FileNotFoundException {
		// BL
		int a = 10 / 0;
		FileReader fr = new FileReader("Abc.txt");
	}

	void m2() {
		// EHC
		try {
			m1();
		} catch (ArithmeticException e) {

		} catch (FileNotFoundException e) {

		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// int a = 10 / 0; ArithmeticException - Unchecked Exception

		FileReader fr = new FileReader("Demo.txt"); // FileNotFoundException - Checked Exception --> Compiler will force
													// you to handle the exception.
	}

}
