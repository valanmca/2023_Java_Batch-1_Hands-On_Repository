/*** Creating a new thread with extends method***/
package com.sara.CoreJava.Day_09;

class MyThread1 extends Thread {
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

public class Thread_Example04 {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		thread1.setName("T1");
		thread1.start();

		MyThread1 thread2 = new MyThread1();
		thread2.setName("T2");
		thread2.start();

		System.out.println("Main Thread END");
	}

}
