package com.core.day_07;

class MyThread3 implements Runnable
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

public class Runnable_Suspend_resume {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(new MyThread3());
		t1.setName("T1");
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		
		System.out.println("main thread");
		
		
		t1.suspend();
//		t1.join(9999);
		
		System.out.println(t1.getState());

		t1.resume();
		
		System.out.println("main thread");
		
		
		
	}

}
