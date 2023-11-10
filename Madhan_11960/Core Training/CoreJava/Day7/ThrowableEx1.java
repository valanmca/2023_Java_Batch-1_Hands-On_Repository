package com.madhan.coreday7;

public class ThrowableEx1 {

	public static void main(String[] args) throws Exception {
		try
		{
			testException();
		}
		catch(Throwable e)
		{
			System.out.println("Exception:" +e.toString());
		}
	}
	
	public static void testException() throws Exception
	{
		throw new Exception("New Exception thrown");
	}

}
