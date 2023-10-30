/*** Creating a new thread and perform getName,getPriority and getState methods***/
package com.sara.CoreJava.Day_09;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("My Thread Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Thread_Example03 {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("Thread1");
		System.out.println(thread1.getName());
		System.out.println(thread1.getPriority());
		System.out.println(thread1.getState());
		thread1.start();
		System.out.println("Main Thread END");

	}

}
