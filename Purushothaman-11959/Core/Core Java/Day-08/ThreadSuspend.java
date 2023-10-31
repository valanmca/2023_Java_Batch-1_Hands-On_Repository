package com.purushoth.day_08;

class MyThread3 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" Thread Running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadSuspend {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new MyThread3());
		t1.setName("T1");
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println(t1.getState());
		
		t1.suspend();
		System.out.println(t1.getState());
		
		System.out.println("Main Thread END");
		Thread.sleep(2000);
		
		t1.resume();
		

	}

}
