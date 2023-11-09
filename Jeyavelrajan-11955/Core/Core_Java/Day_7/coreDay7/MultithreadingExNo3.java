package com.jeyavel.coreDay7;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("My Thread Is running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println();
			}
		}
	}
}

public class MultithreadingExNo3 {

	public static void main(String[] args) {
	  // thread object creation 
		MyThread t1 = new MyThread();
		t1.setName("JR");
		System.out.println(t1.getName());//JR
		System.out.println(t1.getPriority());//5
		System.out.println(t1.getState());//NEW
		
		t1.start();
		System.out.println(t1.getState());//RUNNABLE
		System.out.println("Main thread END");
		System.out.println(t1.getState());//RUNNABLE
		
		//output we cannot predit the output of the thread programs 
		//because it depends on the ooperating system 
    
	}

}
