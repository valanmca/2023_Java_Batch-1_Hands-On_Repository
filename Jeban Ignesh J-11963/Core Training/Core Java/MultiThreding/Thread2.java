package com.jeban.MultiThreding;

public class Thread2 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=5;i++) {
			System.out.println("Main thread is Running.......");
			Thread.sleep(1000);
		}

	}

}
