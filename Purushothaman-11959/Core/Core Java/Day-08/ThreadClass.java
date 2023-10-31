package com.purushoth.day_08;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("MyThread is running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadClass {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.setName("T1");
		System.out.println(t1.getState());
		t1.start();
		
		System.out.println("Main Thread End");

	}

}
