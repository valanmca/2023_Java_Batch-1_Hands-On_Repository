package com.core.day_06_;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("before exception");
		try {
			int a=10/0; // come out from the try block
			System.out.println();
			
		}
		catch(ArithmeticException e){
			System.out.println(""+e);
		}
		catch(NumberFormatException e){
			System.out.println(""+e);
		}
		
		
		// while handling exception we have to come with proper catch block
//		catch (Exception e) // global
//		{
//			System.out.println("cannot divide by 0");
//		}
		
		finally {
			System.out.println("finally");
		}
		System.out.println("After exception");

	}

}
