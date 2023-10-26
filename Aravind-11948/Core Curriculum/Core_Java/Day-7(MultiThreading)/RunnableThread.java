package com.core.day_07;

// way 2 to create thread by implementing runnable

class MyThread2 implements Runnable
{
	public void run(){
		for (int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" Thread Running.."+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				
			}
		}
	}
}

public class RunnableThread {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new MyThread2());
		t1.setName("T1");
		t1.start();
		
		
		Thread t2=new Thread(new MyThread2());
		t2.setName("T2");
		t2.start();

	}

}
