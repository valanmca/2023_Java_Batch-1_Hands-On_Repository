package com.madhan.coreday08;

class MyThread1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"is running");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
public class ThreadUsingRunnable {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new MyThread1());
		t1.setName("M1");
		 System.out.println(t1.getState());
		 t1.start();
		 System.out.println(t1.getState());
		
		
//		 System.out.println(t1.getState());
		
//		Thread t2=new Thread(new MyThread1());
//		t2.setName("M2");
//		t2.start();
		
		
//		System.out.println(t1.getName());
//		 System.out.println(t1.getPriority());
//	      System.out.println(t1);
//	      
//	      System.out.println(t1.getState());
//		 t1.join();
		 t1.suspend();
		System.out.println("Main Thread End");
		t1.resume();
	}

}

//We have sleep ,suspend, join as a thread does not start running until another thread ends.
