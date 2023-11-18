package com.jeyandhan.day09;

public class ThreadMethods {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName()); //main
		System.out.println(t.getPriority()); //5
		
		System.out.println(Thread.MIN_PRIORITY); //1
		System.out.println(Thread.NORM_PRIORITY); //5
		System.out.println(Thread.MAX_PRIORITY); //10
		
		t.setName("Jeyandhan");
		System.out.println(t.getName()); // jeyandhan
		System.out.println(t); // [Jeyandhan, 5, main]
		
		t.setPriority(3); //3
		System.out.println(t.getPriority()); // 3
		System.out.println(t); // [Jeyandhan, 5, main]
		
		System.out.println(t.getState()); //Runnable
	}

}
