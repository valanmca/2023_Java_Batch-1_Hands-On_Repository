package com.dharshu.day8;

class MyThread extends Thread{
	public void run() {  
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" Thread Running....");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}

public class Ex_3_ThreadClass {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("Minion");
		t1.start(); // start MyThread and parallelly run the Mainclass thread (Ex_3_ThreadClass)
		
		MyThread t2 = new MyThread();
		t2.setName("Dharshu");
		t2.start(); 
		System.out.println("Main Thread END");
	}

}
