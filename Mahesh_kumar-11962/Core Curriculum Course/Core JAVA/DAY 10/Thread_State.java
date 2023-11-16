package com.mahesh.core_java_day_10;

public class Thread_State implements Runnable {

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

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Thread_State());
		t1.setName("T1");
		System.out.println("BEFORE STATUS : " + t1.getState()); // NEW

		t1.start();
		System.out.println("AFTER STATUS : " + t1.getState()); // RUNNABLE

		t1.suspend();
		System.out.println("AFTER SUSPEND STATUS : " + t1.getState()); // RUNNABLE

		Thread.sleep(2000);
		System.out.println("AFTER SLEEP STATUS : " + t1.getState()); // RUNNABLE
		t1.resume();
		System.out.println("Main Thread is End");
		System.out.println("AFTER RESUME STATUS : " + t1.getState()); // RUNNABLE

	}

}
