package com.purushoth.day_08;

class MyThread1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" Thread is running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadExtends {
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		t1.setName("T1");
		t1.start();
		
		MyThread1 t2=new MyThread1();
		t2.setName("T2");
		t2.start();
		
		System.out.println("Main Thread END");
		}
}
