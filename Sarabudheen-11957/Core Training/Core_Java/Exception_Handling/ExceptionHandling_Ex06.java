package com.sara.CoreJava.Day_08;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling_Ex06 {

	void m1() throws ArithmeticException, FileNotFoundException {
		// BL
		int a = 10 / 0;
		FileReader fr = new FileReader("Sara.txt");
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
		FileReader fr = new FileReader("Demo.txt");
	}

}
