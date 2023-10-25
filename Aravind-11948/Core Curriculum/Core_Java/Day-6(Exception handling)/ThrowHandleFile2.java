package com.core.day_06_;
//Scenario 2 separate business logic and exception handling 

import java.io.FileReader;
import java.io.FileNotFoundException;

public class ThrowHandleFile2 {
	
	void m1() throws ArithmeticException,FileNotFoundException
	{
		int a=10/0;
		
		FileReader fr=new FileReader("Abc.txt");
		
	}
	
	void m2()
	{
		try {
			m1();
		}
		catch( ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(FileNotFoundException  e)
		{
			System.out.println(e);
		}
		
		
	}
	
	void a1() throws ArrayIndexOutOfBoundsException
	{
		int arr[]= {10,20,30};
		System.out.println(arr[4]);
	}
	
	void a2()
	{ try {
		a1();
	}
	catch (ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
		
	}

	public static void main(String[] args) throws ArithmeticException, FileNotFoundException  {
		ThrowHandleFile2 obj=new ThrowHandleFile2();
		obj.m1();
//		obj.a1();
//		obj.a2();
//		
      
	}

}
