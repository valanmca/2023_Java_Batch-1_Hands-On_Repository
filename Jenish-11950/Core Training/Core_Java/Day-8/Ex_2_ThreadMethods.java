package com.jenish.day08;

//Sleep is predefined static method from threadclass
public class Ex_2_ThreadMethods {

	public static void main(String[] args) throws InterruptedException  {
		for(int i=1; i<=5; i++) {
			System.out.println("Main Thread is Running");
			Thread.sleep(2000);
		}

	}

}
