/*** Creating a new thread with implements method***/
package com.sara.CoreJava.Day_09;

class MyThread2 implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Thread Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Thread_Example05 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread2());
		thread1.setName("T1");
		thread1.start();

		Thread thread2 = new Thread(new MyThread2());
		thread2.setName("T2");
		thread2.start();

		System.out.println("Main Thread END");
	}

}
