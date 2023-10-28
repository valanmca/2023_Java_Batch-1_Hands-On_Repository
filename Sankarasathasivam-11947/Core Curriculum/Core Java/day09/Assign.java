package com.shiva.core.day09;

class Table implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(2 +" *"+i+" ="+(i*2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Table1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.err.println(10+" *"+ i+ " ="+(i*10));
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Table2 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			String GREEN = "\u001B[34m";
			String RESET = "\u001B[0m";
			
//			System.out.println(5+" *"+ i+ " ="+(i*5));
			System.out.println(GREEN +""+5+" *"+ i+ " ="+(i*5)+RESET);
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class Assign {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Table());
		t1.start();
		
		Thread t2=new Thread(new Table1());
		t2.start();
		
		t1.suspend();
		
		Thread t3=new Thread(new Table2());
		t3.start();
		
		t1.resume();
		
		
		
	}

}
