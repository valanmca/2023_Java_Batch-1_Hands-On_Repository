package com.naveen.day7;

// Program to kick start thread class
public class Ex01 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		/*Thread[main,5,main]
		 * main --> thread name
		 * 5 --> priority
		 * main --> thread group name*/
		
		System.out.println(t.getName()); //main
		System.out.println(t.getPriority()); //5
		
		System.out.println(Thread.MIN_PRIORITY); //we can't increment this values -- 1
		System.out.println(Thread.NORM_PRIORITY);// 5
		System.out.println(Thread.MAX_PRIORITY);// 10
		
		t.setName("Naveen");
		System.out.println(t.getName());
		System.out.println(t);
		
		t.setPriority(8);
		System.out.println(t.getPriority()); //8
		System.out.println(t);
		
		/*trying invalid range
		
		t.setPriority(12);
		System.out.println(t.getPriority());
		----------->"Exception in thread "Naveen" java.lang.IllegalArgumentException"*/
		
		//to identify the state of the current thread
		System.out.println(t.getState()); //Runnable(Because main thread is running)
	}

}
