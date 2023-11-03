package com.gayathri.day9Multithreading;

class OwnThread implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Own thread running...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class SampleThreadStage6 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new OwnThread());
		System.out.println(t1.getState());
		t1.start();
		//System.out.println(t1.getState());
		t1.suspend();
		System.out.println(t1.getState());
		t1.resume();
		//System.out.println(t1.getState());
		
		 

	}

}
