package com.madhan.coreday7;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try
		{
			int a=10/2;
			try
			{
				int b=Integer.parseInt("abc");
			}
			catch(NumberFormatException e)
			{
				System.out.println("A");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("B");
		}
		catch(ArithmeticException e)
		{
			System.out.println("C");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("After Exception");
		
	}

}
