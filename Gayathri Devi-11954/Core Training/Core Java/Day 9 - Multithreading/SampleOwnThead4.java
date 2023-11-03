package com.gayathri.day9Multithreading;

class MyOwnThread2 extends Thread{
	public void run()
	{
		for (int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" Own thread class running with sleep method....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
public class SampleOwnThead4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread"); // it depends on the system os
		
		MyOwnThread2 t1 = new MyOwnThread2();		
		System.out.println("Get State : "+t1.getState());
		t1.setName("T1");
		t1.start();
		System.out.println("Get name : "+t1.getName()); //MyOwnThred
		System.out.println("Get Priority : "+t1.getPriority());//5
		System.out.println("Get State : "+t1.getState());
		
		MyOwnThread2 t2 = new MyOwnThread2();
		t2.setName("T2");
		t2.start();
	}

}
