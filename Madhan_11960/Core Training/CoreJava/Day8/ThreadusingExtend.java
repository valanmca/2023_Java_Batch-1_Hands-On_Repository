package com.madhan.coreday08;


class MyThread extends Thread
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
public class ThreadusingExtend {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.setName("M1");
		t1.start();
		
		MyThread t2=new MyThread();
		t2.setName("M2");
		t2.start();
		
		
//		System.out.println(t1.getName());
//		 System.out.println(t1.getPriority());
//	      System.out.println(t1);
//	      
//	      System.out.println(t1.getState());

		
		System.out.println("Main Thread End");
	}

}
