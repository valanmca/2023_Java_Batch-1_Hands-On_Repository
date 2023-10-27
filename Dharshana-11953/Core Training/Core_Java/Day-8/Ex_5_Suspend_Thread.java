package com.dharshu.day8;

class MyThread2 extends Thread{
	public void run() {  
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" Thread Running....");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}

public class Ex_5_Suspend_Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread (new MyThread2());
		
		t1.setName("Minion");
		System.out.println(t1.getState()); //NEW
		
		t1.start(); 
		System.out.println(t1.getState()); //RUNNABLE
		Thread.sleep(1000);
		
		t1.suspend();
		Thread.sleep(1000);
		System.out.println(t1.getState()); //WAITING
		
		System.out.println("Main Thread END");
		Thread.sleep(4000);
		
		t1.resume();	
	}

}
