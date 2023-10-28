package com.shiva.core.day08;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Except_03 {
	
	void m1() throws ArithmeticException, FileNotFoundException{
		//Business Logic
		int a=10/0;
		FileReader fr=new FileReader("Abc.txt");
	}
	void m2() {
		//Exception Handling
		try {
			m1();
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws FileNotFoundException{
//		int a=10/0; //ArithmeticException - Unchecked Exception
		
//		FileReader fr=new FileReader("Demo.txt");//FileNotFoundException - Checked Exception
		
		Except_03 obj=new Except_03();
		obj.m2();
	}

}
