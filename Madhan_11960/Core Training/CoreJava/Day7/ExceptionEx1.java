package com.madhan.coreday7;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int b=10,c=0;
		int d;
		try
		{
//			int a[]=new int[-5];
//			a[5]=10/0;         //Arithmetic exception (Divide by zero)//predefined class from java.lang package.
//			System.out.println(a[10]); //Indexoutofbound Exception
//			String s=null;             //nullpointer exception
//			System.out.println(s.length());
//			int a=Integer.parseInt("abc"); //NumberFormatException
//			Object o=new ExceptionEx1(); //DMD supports becoz Object is a superclass for all object.
//			ExceptionEx1 Ex=(ExceptionEx1) new Object(); //ClassCastException
//			d=b/c;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("IndexOutofbound Exception Occurs");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer Exception Occurs");
		}
		
	}

}
