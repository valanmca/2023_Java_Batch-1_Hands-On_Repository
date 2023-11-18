package com.jeyandhan.day09;

class Two extends Thread{
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println(i+"*"+2+"="+i*2);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Five extends Thread{
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println(i+"*"+5+"="+i*5);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Ten extends Thread{
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println(i+"*"+10+"="+i*10);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Multiplication {

	public static void main(String[] args) throws InterruptedException {
		Two two = new Two();
		Five five = new Five();
		Ten ten = new Ten();
		
		two.start();
		two.join();
		
		five.start();
		five.join();
		
		ten.start();
		
		
	}

}
