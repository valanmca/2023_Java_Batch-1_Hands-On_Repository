package com.core.day_07;

class MyThread4 implements Runnable
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
public class JoinInThread {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new MyThread4());
		t1.setName("T1");
		t1.start();
		
		
		t1.join();  // main thread wait util the t1 set finish the execution
		
		System.out.println("main thread");
		

	}

}
