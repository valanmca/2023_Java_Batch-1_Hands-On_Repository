package com.gayathri.day9Multithreading;

public class SampleThread1 {

	public static void main(String[] args) {
		
		//everything is a predefined method from thread class.
		//thread class is three constant vale - min, max, normal
		
		Thread t = Thread.currentThread();
		System.out.println("current Thread : "+t);
		/*
		 * Thread[main,5,main]
		 * Thread[Thread Name,Priority value,Thread Group]
		 */
		System.out.println("Get Name : "+t.getName());//main
		System.out.println("get priority : "+t.getPriority());//5
		
		System.out.println("Minimum Priority : "+Thread.MIN_PRIORITY);	//1
		System.out.println("Normal or default priority : "+Thread.NORM_PRIORITY);	//5
		System.out.println("Maximum priority : "+Thread.MAX_PRIORITY);	//10
		
		t.setName("First Thread");
		System.out.println("Get Name : "+t.getName());//First Thread
		System.out.println("current Thread : "+t);
		
		t.setPriority(8);
		System.out.println("get priority : "+t.getPriority());//8
		System.out.println("current Thread : "+t);
		
		/*
		 * t.setPriority(15);
		 * System.out.println("get priority : "+t.getPriority());//8
		 * System.out.println("current Thread : "+t);		
		 * Exception in thread "First Thread" java.lang.IllegalArgumentException 
		 * at java.base/java.lang.Thread.setPriority(Thread.java:1138)
		 */
		
		System.out.println("State of thread : "+t.getState());//runnable
	}

}
