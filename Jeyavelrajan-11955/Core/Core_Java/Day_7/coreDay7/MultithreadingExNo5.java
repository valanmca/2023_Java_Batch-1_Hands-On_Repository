package com.jeyavel.coreDay7;

//Runnable is the predifined class in the java.lang package 
//the interface hase only one Abstract method then it is known as functional iterface - EX Runnable 
//Marker interface is known as 0 abstract Method - or empty interface 
//serialization 

class MyThread2 implements Runnable{
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

public class MultithreadingExNo5 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread2());
		t1.setName("T1");
		t1.start();
		
		
		Thread t2 = new Thread(new MyThread2());
		t2.setName("T2");
		t2.start();
        
		System.out.println("Main Thread END ");



	}

}
