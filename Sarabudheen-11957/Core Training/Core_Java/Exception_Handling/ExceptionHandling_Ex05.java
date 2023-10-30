/*** Examples for Throws keyword ***/
package com.sara.CoreJava.Day_08;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling_Ex05 {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader file = new FileReader("demo.txt"); // FileNotFound - Checked
	}

}
