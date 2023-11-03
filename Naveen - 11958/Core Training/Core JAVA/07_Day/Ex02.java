package com.naveen.day7;

//Thread Methods
public class Ex02 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=5; i++) {
			System.out.println("Main thread is running.....");
			Thread.sleep(2000);
		}
		
	}

}
