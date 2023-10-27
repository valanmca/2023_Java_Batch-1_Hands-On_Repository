package com.dharshu.day8;

class MyThread3 extends Thread{
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

public class Ex_6_Join_Thread {

	public static void main(String[] args)throws InterruptedException {
		Thread t1 = new Thread (new MyThread3());
		
		t1.setName("Minion");
		t1.start(); 
		
		t1.join();
		System.out.println("Main Thread END");
	}

}
