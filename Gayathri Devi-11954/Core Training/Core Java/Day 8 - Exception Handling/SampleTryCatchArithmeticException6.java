package com.gayathri.day8Exception;

//Exception handling sample program
//try & catch = keywords
public class SampleTryCatchArithmeticException6 {

	public static void main(String[] args) {
		
		System.out.println("Arithmetic Exception using try & catch block");
		
		System.out.println("\nBefore Exception");
		
		try {		
			int a = 10 / 0;
			System.out.println("A");//it will not display. try block always focus on 1st line if error is occure it will go to the catch block. it doesn't consider rest of lines.
		}
		catch(ArithmeticException e){
			System.out.println(e);
			//System.out.println("Arithmetic exception"+e);
			//System.out.println("Arithmetic Exception");
		}
		
		
		System.out.println("After Exception");

	}

}
