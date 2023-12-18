package com.jeban.MultiThreding;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My Thread Running....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Thread3 {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		System.out.println(t1);//[Thread-0,5,main]
		t1.setName("T1");
		System.out.println(t1.getName());//T1
		System.out.println(t1);//[T1,5,main]
		System.out.println(t1.getPriority());//5
		System.out.println(t1.getState());//New
		t1.start();
		
		System.out.println("Main Thread End");

	}

}
