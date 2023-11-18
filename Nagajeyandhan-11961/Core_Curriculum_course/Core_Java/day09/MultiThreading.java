package com.jeyandhan.day09;

class Num implements Runnable{
	public void run()  {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
}
class one{
	void disp(){
		System.out.println("Welcome");
	}
}
class StrVal extends Num implements Runnable {
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("hiii");
			
		}
	}
}



public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		Runnable obj = new Num();
		Runnable obj1 =new StrVal();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		t1.setName("Number"); 
		System.out.println(t1.getName());
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("End");

	}

}
