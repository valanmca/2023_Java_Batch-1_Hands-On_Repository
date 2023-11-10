package com.madhan.coreday7;

public class ExceptionTryCatchEx1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try
		{
			throw new Error();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
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
