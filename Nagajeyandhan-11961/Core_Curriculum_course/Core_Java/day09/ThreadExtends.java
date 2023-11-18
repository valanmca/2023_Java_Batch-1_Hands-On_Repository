package com.jeyandhan.day09;


class MyThread extends Thread{
	public void run() {
			for(int i = 1; i<=5; i++) {
			
			System.out.println(Thread.currentThread().getName()+"Thread is running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
	}
}
}
public class ThreadExtends {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
		t1.setName("T1");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("T2");
		t2.start();
		
		System.out.println("Main method End");
		

	}

}
