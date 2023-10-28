package com.jenish.day08;

class MyThread extends Thread{
	public void run() {  // run is an override method
		for(int i=1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName() +"Thread Running....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Ex3_ThreadClass {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("T1");
//		System.out.println(t1.getName()); //T1 To display the thread name
//		System.out.println(t1.getPriority()); //5 To print the current priority value
//		System.out.println(t1.getState()); //NEW  To Display the State of the thread
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("T2");
		t2.start();
		
//		System.out.println(t1.getState()); //RUNNABLE
		System.out.println("Main Thread END");
		
	}

}
