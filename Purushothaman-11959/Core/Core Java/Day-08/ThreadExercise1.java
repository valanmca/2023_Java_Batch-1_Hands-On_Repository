package com.purushoth.day_08;

class Thread1 implements Runnable{
	public synchronized void run() {
		int a=2;
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Thread2 implements Runnable{
	public synchronized void run() {
		int a=5;
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Thread3 implements Runnable{
	public synchronized void run() {
		int a=10;
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadExercise1 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Thread1());
		Thread t2=new Thread(new Thread2());
		Thread t3=new Thread(new Thread3());
		
		t1.start();
		t2.start();
		t3.start();	

	}

}
//Print tables using Thread.
