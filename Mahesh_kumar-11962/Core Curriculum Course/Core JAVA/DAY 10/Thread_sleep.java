package com.mahesh.core_java_day_10;

public class Thread_sleep {

	public static void main(String[] args) throws InterruptedException {

		for (int index = 0; index < 5; index++) {
			System.out.println("Main Thread is running.....");
			Thread.sleep(1000);
		} // wait this thread until 1000 milliseconds
			// ex - traffic light

	}

}
