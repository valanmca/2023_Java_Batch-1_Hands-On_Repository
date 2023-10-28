package com.shiva.core.day09;

public class Multithread_02 {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread is Running....");
			Thread.sleep(2000);
		}

	}

}
