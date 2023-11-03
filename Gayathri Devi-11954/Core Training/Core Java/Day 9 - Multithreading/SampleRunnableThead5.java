package com.gayathri.day9Multithreading;

class MyRunnableThread implements Runnable{
	public void run()
	{
		for (int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" Own thread class running with sleep method....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
public class SampleRunnableThead5 {

	public static void main(String[] args) {
		
		System.out.println("Main thread"); // it depends on the system os
		Thread t = new Thread(new MyRunnableThread());
		t.setName("T1");
		t.start();
		
		Thread t2 = new Thread(new MyRunnableThread());
		t2.setName("T2");
		t2.start();
	}
}
