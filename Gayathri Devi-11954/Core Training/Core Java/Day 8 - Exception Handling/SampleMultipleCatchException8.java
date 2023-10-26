package com.gayathri.day8Exception;

//Exception handling sample program
//try & catch = keywords
public class SampleMultipleCatchException8 {

	public static void main(String[] args) {
		
		System.out.println("Number format Exception using try & catch block");
		
		System.out.println("\nBefore Exception");
		
		try {		
			int a = 10 / 0;
			/*try {
			int b = Integer.parseInt("abc");
			}
			catch(NumberFormatException e){
				System.out.println(e);			
			}*/
			// int a = 10 / 0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e){
			System.out.println(e);			
		}		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		System.out.println("After Exception");

	}

}
