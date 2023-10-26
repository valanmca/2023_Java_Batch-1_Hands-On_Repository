package com.naveen.day7;
// Creation of Own Thread

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("My Thread is Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("T1");
		System.out.println(t1.getName()); // T1
		System.out.println(t1.getPriority()); // 5
		System.out.println(t1.getState()); // New or Ready to Execute

		t1.start();
		System.out.println("Main Thread END");
	}

}
