package com.jenish.day08;
class MyThread2 implements Runnable{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+"Thread Running....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class Ex_5_SuspendThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread());
		t1.setName("T1");
		System.out.println(t1.getState()); //NEW
		t1.start();
		System.out.println(t1.getState()); //RUNNABLE
		Thread.sleep(1000);
		
		t1.suspend();
		
		Thread.sleep(1000);
		System.out.println(t1.getState()); //Waiting
		
		System.out.println("Main Thread END");
		Thread.sleep(4000);
//		Thread t2 = new Thread(new MyThread());
//		t2.setName("T2");
//		t2.start();
		t1.resume();
		
		
		//System.out.println("Main Thread END");
		
	}

}
