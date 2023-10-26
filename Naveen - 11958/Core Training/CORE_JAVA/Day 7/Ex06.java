package com.naveen.day7;

//Suspending the running thread
class MyThread3 implements Runnable {
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

public class Ex06 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread3());
		t1.setName("T1");
		System.out.println(t1.getState()); // NEW
		t1.start();
		System.out.println(t1.getState()); // RUNNABLE
		Thread.sleep(1000);

		// t1.suspend();

		Thread.sleep(1000);
		System.out.println(t1.getState()); // Waiting

		System.out.println("Main Thread END");
		Thread.sleep(4000);
		// t1.resume();
		// System.out.println(t1.getState()); //RUNNABLE
	}

}
