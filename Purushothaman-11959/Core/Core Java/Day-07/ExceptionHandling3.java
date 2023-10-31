package com.purushoth.day_07;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling3 {

	public static void main(String[] args) throws FileNotFoundException {
		//int a=10/0; //ArithmeticException - Unchecked Exception

		FileReader fr=new FileReader("Demo.txt"); //FileNotFoundException - Checked Exception
	}

}
