package com.gayathri.day8Exception;

//Exception handling sample program
//try & catch = keywords
public class SampleTryCatchArithNumberException7 {

	public static void main(String[] args) {
		
		System.out.println("Arithmetic & Number Format block");
		
		System.out.println("\nBefore Exception");
		
		try {		
			int a = 10 / 0;
		}
	
		catch(NumberFormatException e){
			System.out.println(e);			
		}
		
		
		
		System.out.println("After Exception");

	}

}
