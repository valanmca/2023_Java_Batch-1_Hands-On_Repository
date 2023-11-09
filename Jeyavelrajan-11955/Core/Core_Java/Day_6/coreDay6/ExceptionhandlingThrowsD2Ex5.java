package com.jeyavel.coreDay6;
import java.io.*;
//The purpose of the throws keyword is to separate the try catch handlers from business logic 
//to give the easily understandable code
public class ExceptionhandlingThrowsD2Ex5 {
   
	void m1() throws ArithmeticException,FileNotFoundException {
		//BL
		int a = 10/0;
		FileReader fl = new FileReader("ABC.txt");
	}
	void m2() {
		//EHC
		try {
			m1();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(FileNotFoundException e) {
			
		}
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//FileReader fl = new FileReader("Demo.txt");//FileNotFoundException - checked Exception
	
	}

}
