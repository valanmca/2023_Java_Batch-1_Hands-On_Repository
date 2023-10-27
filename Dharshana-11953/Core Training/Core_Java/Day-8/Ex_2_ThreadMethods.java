package com.dharshu.day8;

public class Ex_2_ThreadMethods {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			System.out.println("Main Thread is Running");
			Thread.sleep(2000);
		}

	}

}
