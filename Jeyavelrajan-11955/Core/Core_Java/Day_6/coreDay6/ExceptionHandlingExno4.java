package com.jeyavel.coreDay6;
//Multiple catch block in Exception Handling 
import java.io.*;
public class ExceptionHandlingExno4 {

	public static void main(String[] args) {
		int a=10,b=0;
		int c;
		try {
			int d[] = null;
			System.out.println(d[1]);
			c=a/b;
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occured");
		}
		catch(Exception e) {
			System.out.println("Exception Handling Occured ");
		}
		finally {
			System.out.println("Finally is executed ");
		}
		
		File file = new File("abc.txt");
		try {
			FileInputStream fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}