package com.core.day_07;
class Thread4 implements Runnable
{
	public void run()
	{
		try {
			
		
		 int a=10/0;
		}
		finally {
			System.out.println(Thread.currentThread().getState());
		}
	}
}

class Thread5 implements Runnable
{
	public void run()
	{
		 for (int i=0;i<=5;i++)
		 {
			 System.out.println(i);
		 }
	}
}




public class ExceptionInThread {

	public static void main(String[] args) {
		
		Thread n=new Thread( new Thread4());
		
		n.start();
		System.out.println(n.getState());
		
		Thread m=new Thread( new Thread5());
		
		m.start();
		System.out.println(m.isAlive());
		 
		
		System.out.println("After thead 2 is running : "+n.getState());
		System.out.println(n.isAlive());

	}

}
