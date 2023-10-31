package com.purushoth.day_08;

class MyThread4 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" Thread Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new MyThread4());
		t1.setName("T1");
		t1.start();
		
		t1.join(); // Waiting to complete the T1 and to next thread.
		
		System.out.println("Main Thread END");

	}

}
