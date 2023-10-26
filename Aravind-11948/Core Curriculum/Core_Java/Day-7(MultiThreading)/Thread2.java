package com.core.day_07;

public class Thread2 {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i=0;i<=5;i++)
		{
			System.out.println("Main thread is running ...");
			Thread.sleep(2000);  //sleep is an static method from thread class and it throws interrupted exception
		}
		
		
		
	}

}
