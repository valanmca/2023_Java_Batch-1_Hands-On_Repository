package com.mahesh.core_java_day_10;



public class Thread_Run extends Thread {
	
	public void run() // run is a build in method in Thread class , in this code we override the run()
	{
		for (int index = 0; index < 3; index++) {
			System.out.println(Thread.currentThread().getName() + "-Thread is running.....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}

	}
	public static void main(String[] args)
	{
	Thread t1 = new Thread(new Thread_Run());
	t1.setName("T1");
	t1.start();
	Thread t2 = new Thread(new Thread_Run());
	t2.setName("T2");
	t2.start();
	System.out.println("Main Thread End");
}
}
