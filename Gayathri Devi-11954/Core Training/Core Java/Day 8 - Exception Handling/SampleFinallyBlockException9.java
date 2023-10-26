package com.gayathri.day8Exception;

//Exception handling sample program
//try & catch = keywords
public class SampleFinallyBlockException9 {

	public static void main(String[] args) {
		
		System.out.println("Finally Block");
		
		System.out.println("\nBefore Exception");
		
		try {		
			throw new Error();
		}
		/*catch(Exception e) {
			System.out.println(e);
		}*/ 	// error occured = unreachable code because sub class to super class is possible . 
		//not superclass to subclass is not possible
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e){
			System.out.println(e);			
		}		
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Works !");
		}
		
		
		System.out.println("After Exception");

	}

}
