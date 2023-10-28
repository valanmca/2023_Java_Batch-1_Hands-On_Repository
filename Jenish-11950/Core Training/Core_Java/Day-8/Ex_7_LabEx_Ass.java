package com.jenish.day08;

class TwoTable implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "*" + 2 + "=" + (i * 2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class FourTable implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "*" + 4 + "=" + (i * 4));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class SixTable implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i + "*" + 6 + "=" + (i * 6));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
public class Ex_7_LabEx_Ass {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new TwoTable());
		t1.setName("T1");
		t1.start();

		t1.join();
		
		Thread t2 = new Thread(new FourTable());
		t2.setName("T2");
		t2.start();
		
		t2.join();
		
		Thread t3 = new Thread(new SixTable());
		t3.setName("T3");
		t3.start();
		
	}
}
