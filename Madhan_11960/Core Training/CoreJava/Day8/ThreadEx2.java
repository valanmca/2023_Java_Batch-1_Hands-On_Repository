package com.madhan.coreday08;

public class ThreadEx2 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread is running");
			Thread.sleep(2000);
		}
	}

}
