package com.jeyavel.coreDay6;
//these are the possible types to declare exception
//T T T T T
//C C C C F
//  C C
//    F
public class ExceptionhandlingD2Ex2 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			@SuppressWarnings("unused")
			int a=10/0;//when the exception is found then compailer will come out from the loop 
			@SuppressWarnings("unused")
			int b = Integer.parseInt("abc");
			System.out.println("A");
		}
		catch(ArithmeticException e) {//By using specific catch and give the meaningfull(understandable) message to the user   
			System.out.println(e);
		}
		catch(NumberFormatException e) {//use the relevant catch block otherwise the program ends abnormally
			System.out.println(e);
		}
		catch(Exception e) { // Common catch Block  and it is a superclass for all the exceptions so the order must be subtype to supertype 
			System.out.println(e);  //because if we use the Superclass Ecxeption in first catch other catch block will be unrechable code
		}
		
		finally { //One try block have only one finally Block 
			System.out.println("Finally");
		}
		System.out.println("After Exception");

	

  }
}
