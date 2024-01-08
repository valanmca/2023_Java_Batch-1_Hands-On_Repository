package com.aravind.junit;

public class Calculator {
	
	
	public int add(int x,int y)
	{
		return x+y;
	}
	
	
	public int multi(int x,int y)
	{
		int result=0;
		result=x*y;
		return result;
	}
	
	public int addarray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		return sum;
	}
	
	
	public int divide(int x,int y)
	{
		return x/y;
	}

}
