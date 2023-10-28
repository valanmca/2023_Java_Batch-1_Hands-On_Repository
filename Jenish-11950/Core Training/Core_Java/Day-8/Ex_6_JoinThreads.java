package com.jenish.day08;
class MyThread3 implements Runnable{
	public synchronized void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+"Thread Running....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class Ex_6_JoinThreads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread());
		t1.setName("T1");
		t1.start();
		
		t1.join();
		
		System.out.println("Main Thread END");
		
	}

}
