package com.dharshu.day7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex_4_Throws_FileReader {

	void m1() throws ArithmeticException, FileNotFoundException {
		//Business Logic
		int a = 10 / 0;
		FileReader fr = new FileReader("Abc.txt");
	}
	void m2() {
		//Exception Handling Checked
		try {
			m1();
		} catch(ArithmeticException e) {
			
		} catch(FileNotFoundException e) {
			
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stu
		//int a = 10 / 0;  //ArithmeticException - Unchecked Exception
		
				FileReader fr = new FileReader("Demo.txt"); //FileNotFoundException - Unchecked Exception

	}

}
