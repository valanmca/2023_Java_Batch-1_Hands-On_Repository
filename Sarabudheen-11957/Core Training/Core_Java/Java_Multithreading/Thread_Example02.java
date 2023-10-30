/*** Thread Example with sleep method ***/
package com.sara.CoreJava.Day_09;

public class Thread_Example02 {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread is Running...");
			Thread.sleep(2000);
		}
	}

}
