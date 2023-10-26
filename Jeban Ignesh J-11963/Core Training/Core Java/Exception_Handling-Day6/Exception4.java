package com.jeban.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception4 {

	void m1() throws ArithmeticException {
		// BL
		int a = 10 / 0;

	}

	void m3() throws FileNotFoundException {
		FileReader fr = new FileReader("Abc.txt");

	}

	void m2() {
		// EHC
		try {

			m3();
			m1();
		} catch (ArithmeticException e) {
			System.out.println("A");

		} catch (FileNotFoundException e) {
			System.out.println("B");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
//		int a=10/0; //Arithmetic Exception -Unchecked Exception

//		
//
//		FileReader f = new FileReader("Demo.txt");// FileNotFoundException-Checked Exception
//		
		Exception4 obj = new Exception4();
		obj.m2();

	}

}