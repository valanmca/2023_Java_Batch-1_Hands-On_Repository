package com.jeyavel.coreDay6;
import java.util.*;
import java.io.*;
//checked exception 
//it is show in the compile time 
public class ExceptionHandlingExno6 {

	public static void main(String[] args) throws OutOfBalanceException {
		
      File fil = new File("abc.txt");
      try {
		FileInputStream fs = new FileInputStream(fil);
	} catch (FileNotFoundException e) {
	
//		e.printStackTrace();
	}
      
      System.out.println("file");
	
	int i=0;
	try(Scanner sc = new Scanner(System.in)){
		 i= sc.nextInt();
	}
	
	System.out.println(i);
	


	
	
}
}
