package com.madhan.coreday7;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Throws {
	
	void m1() throws ArithmeticException,FileNotFoundException
	{
		int a=10/0;
		FileReader fr=new FileReader("Abc.txt");
	}
	
	void m2()
	{
		try
		{
			m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found exception");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr=new FileReader("Sample.txt");
	}

}
