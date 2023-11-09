package com.jeyavel.coreDay7;


class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"Thread Running ....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println();
			}
		}
	}
}

public class MultithreadingExNo4 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setName("T1");
		t1.start();
		
		
		MyThread1 t2 = new MyThread1();
		t1.setName("T2");
		t1.start();
        
		System.out.println("Main Thread END ");


	}

}
