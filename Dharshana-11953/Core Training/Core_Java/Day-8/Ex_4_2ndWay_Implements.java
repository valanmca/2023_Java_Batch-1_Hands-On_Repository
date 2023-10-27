package com.dharshu.day8;

class MyThread1 extends Thread{
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

public class Ex_4_2ndWay_Implements {

	public static void main(String[] args) {
		Thread t1 = new Thread (new MyThread1());
		t1.setName("Minion");
		t1.start(); // start MyThread and parallelly run the Mainclass thread (Ex_3_ThreadClass)
		
		Thread t2 = new Thread (new MyThread1());		
		t2.setName("Dharshu");
		t2.start(); 
		System.out.println("Main Thread END");

	}

}
