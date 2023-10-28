package com.shiva.core.day09;

class MyThread extends Thread {
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

public class Multithread_03 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.setName("T1");
//		t1.start();
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getState());// New

		t1.start();
		System.out.println(t1.getState());// Runnable
//		t1.suspend();
		
		Thread.sleep(1000);
		System.out.println(t1.getState());// Timed-Waiting

//		MyThread t2=new MyThread();
//		t2.setName("T2");
//		t2.start();
		
		System.out.println("Main Thread Ends");

	}

}
