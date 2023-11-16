package com.mahesh.core_java_day_10;

public class Thread_Run_Method extends Thread {

	public void run() // run is a build in method in Thread class , in this code we override the run()
	{
		for (int index = 0; index < 3; index++) {
			System.out.println("MyThread is running.....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}

	}

	public static void main(String[] args) {

		Thread_Run_Method t1 = new Thread_Run_Method();
		t1.start();
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getState());
	}

}
