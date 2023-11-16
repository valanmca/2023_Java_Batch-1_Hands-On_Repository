package com.mahesh.core_java_day_10;

public class Thread_Methods {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println("Current Thread is : " + t); // Current Thread is : Thread[main,5,main]
		System.out.println("Name of the Thread : " + t.getName()); // Name of the Thread : main
		System.out.println("Priority Level : " + t.getPriority()); // Priority Level : 5
		System.out.println("Minimum Priority : " + Thread.MIN_PRIORITY); // Minimum Priority : 1
		System.out.println("Normal Priority : " + Thread.NORM_PRIORITY); // Normal Priority : 5
		System.out.println("Maximum Priority : " + Thread.MAX_PRIORITY); // Maximum Priority : 10
		t.setName("Mahesh");// After name Change
		System.out.println("Current Thread name : " + t.getName()); // Current Thread name : Mahesh

		t.setPriority(8);
		System.out.println("Current Proiority level : " + t.getPriority()); // Current Proiority level : 8

		System.out.println(t.getState()); // RUNNABLE

	}

}
