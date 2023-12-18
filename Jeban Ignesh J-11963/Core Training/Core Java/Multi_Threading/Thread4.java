package com.jeban.Multi_Threading;

class Mythread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"Thread Running......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Thread4 {

	public static void main(String[] args) {
		Mythread t1=new Mythread();
		t1.setName("T1");
		t1.start();
		
		Mythread t2=new Mythread();
		t2.setName("T2");
		
		System.out.println("Main Thread End");

	}

}
