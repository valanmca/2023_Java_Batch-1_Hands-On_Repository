package com.shiva.core.day09;

class MyThread1 implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" Thread is Running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}
}
public class Multithread_04 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread1());
		t1.setName("T1");
		t1.start();
		

		MyThread t2=new MyThread();
		t2.setName("T2");
		t2.start();
		
		System.out.println("Main Thread Ends");

	}

}
