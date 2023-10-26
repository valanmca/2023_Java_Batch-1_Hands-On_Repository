package com.naveen.day7;
// Suspending a thread using join()
class MyThread4 implements Runnable {
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
public class Ex07 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread4());
		t1.setName("T1");
		t1.start();
		
		t1.join();

		System.out.println("Main Thread END");

	}

}
