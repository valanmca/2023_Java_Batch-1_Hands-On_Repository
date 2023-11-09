package com.jeyavel.coreDay6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionhandlingCheckedUncheckedD2Ex4 {

	//Throws is avoiding the compile time error
	public static void main(String[] args) throws FileNotFoundException {
		
			//int a = 10/0;// Unchecked Exception
			
		
				FileInputStream fs = new FileInputStream("fil.txt");//checked exception


	}

}
