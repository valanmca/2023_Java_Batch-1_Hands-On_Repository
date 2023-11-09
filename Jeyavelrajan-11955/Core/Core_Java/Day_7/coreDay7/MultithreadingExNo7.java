package com.jeyavel.coreDay7;
//join 
//circular wait is known as dead lock -it is happeaning because of common resource 
//Synchronized is used to create a lock on the common resource to avoid the dead lock 

//what is Stop() in java - it stop is used to kill the thread 
//what is the usage of yield() method - frequent question in interview 
//Resume 

class MyThread3 implements Runnable{
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
public class MultithreadingExNo7 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread());
		t1.setName("T1");
		t1.start();
		
		t1.join();
		
		System.out.println("Main thread END");
		

	}

}
