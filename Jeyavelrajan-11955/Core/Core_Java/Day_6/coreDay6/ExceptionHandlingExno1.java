package com.jeyavel.coreDay6;
//these are unchecked exception
// it is found on runtime 
public class ExceptionHandlingExno1 {
	public static void main (String[]args) {
		
	
	try {
		@SuppressWarnings("unused")
		int a =100/0;
	}
	catch(Exception e){
		System.out.println("catch handling the exception"+ e);
		
	}
	finally {
		System.out.println("the finally always print the data whether the program contains error or not");
	}

 }
}
