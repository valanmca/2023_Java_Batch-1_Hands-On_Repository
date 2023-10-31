package com.purushoth.day_07;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class Throws1 {

	void m1() throws ArithmeticException,FileNotFoundException{
		int a=10/0;
		FileReader fr=new FileReader("Abc.txt");
	}
	void m2() {
		try {
			m1();
		} catch(ArithmeticException e) {
			System.out.println("A");
		} catch(FileNotFoundException e) {
			System.out.println("B");
		}
	}
	public static void main(String[] args) {
		
    Throws1 obj=new Throws1();
    obj.m2();
	}

}
