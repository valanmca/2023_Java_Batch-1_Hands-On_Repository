package com.jeyavel.coreDay6;

//keywords - try , catch
public class ExceptionhandlingNestedD2Ex3 {

	public static void main(String[] args) {
		
		try {//outer try
			int a= 10/0;
			
			try {//inner try
				int b = Integer.parseInt("abc");
			}
			catch(NumberFormatException e) {
				System.out.println("A - inner catch");
			}
			
		}catch(NumberFormatException e){
			System.out.println("B - outer catch");
			
		}catch(ArithmeticException e) {
			System.out.println("c - Outer catch");
			
		}catch(Exception e) {
			System.out.println("D - Outer Super catch");
			
		}finally {
			System.out.println("Finally - for smooter termination ");
		}
		System.out.println("After Exception");
		

	}

}
