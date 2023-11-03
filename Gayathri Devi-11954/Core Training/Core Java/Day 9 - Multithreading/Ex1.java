package com.gayathri.day9Multithreading;

class TwoTable extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i +"x 2 = "+(i*2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class FiveTable extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i +"x 5 = "+(i*5));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
class TenTable implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i +"x 10 = "+(i*10));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		TwoTable obj1 = new TwoTable();
		obj1.start();
		//obj1.suspend();
		obj1.join();
		Thread obj2 = new Thread(new FiveTable());
		obj2.start();
		//obj2.join();
		obj2.suspend();obj2.resume();
		
		
		Thread obj3 = new Thread(new TenTable());
		obj3.start();
		
		
		

	}

}
