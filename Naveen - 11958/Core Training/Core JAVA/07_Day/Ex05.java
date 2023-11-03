package com.naveen.day7;

//Creation of thread class using implementing Runnable
class MyThread2 implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Thread is Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}

}
public class Ex05 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread2());
		t1.setName("T1");
		t1.start();

		Thread t2 = new Thread(new MyThread2());
		t2.setName("T2");
		t2.start();

		System.out.println("Main Thread END");
	}

}
