package com.core.day_06_;

public class NestedTry {

	public static void main(String[] args) {
		System.out.println("Berfore Exception");
		try {
			int a=10/2; 
			
			try {
				int b=Integer.parseInt("abc");
			}
			catch(NumberFormatException e) // relevant 
			{
				System.out.println("A");
			}
			
		}
		catch(ArithmeticException e){
			System.out.println("B"+e);
		}
		catch(NumberFormatException e){
			System.out.println("C"+e);
		}
		
		finally {
			System.out.println("Finally");
		}

	}

}
