package com.jeyandhan.day08;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyWord{

	void m1()  throws ArithmeticException, FileNotFoundException{
		int a = 10/0;
		FileReader fr = new FileReader ("Demo.txt");
	}
	void m2() {
		try {
			m1();
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(FileNotFoundException e) {
			
		}
	}
	
	public static void main(String[] args) {
		ThrowsKeyWord obj = new ThrowsKeyWord();
		
		obj.m2();
	}

}
