package com.mahesh.core_java_day_09;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_Method {

	void logics() throws FileNotFoundException {
		int value = 10 / 0;
		FileReader fr = new FileReader("intro.txt");
	}

	void exception() {
		try {
			logics();
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		Exception_Method em = new Exception_Method();
		em.exception();
	}

}
