package com.purushoth.day_08;

class MyThread2 implements Runnable{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" Thread Running....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
			}
		}
	}
}
public class ThreadImplements {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new MyThread2());
		t1.setName("T1");
		t1.start();
		
		//Thread.sleep(1000);
		//System.out.println(t1.getState()); //It is for timed_waiting
		
		Thread t2=new Thread(new MyThread2());
		t2.setName("T2");
		t2.start();

		System.out.println("Main Thread End");
	}

}
