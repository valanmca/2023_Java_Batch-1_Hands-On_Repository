package com.purushoth.day_08;

public class ThreadBasics {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
	    System.out.println(t);
	    System.out.println("Thread name : "+t.getName());
	    System.out.println("Thread priority : "+t.getPriority());

	    System.out.println(Thread.MIN_PRIORITY);  //1
	    System.out.println(Thread.NORM_PRIORITY);  //5
	    System.out.println(Thread.MAX_PRIORITY);   //10

	    t.setName("Sandy");    //changing thread name
	    System.out.println("Thread name : "+t.getName());
	    System.out.println(t);
	    
	    t.setPriority(7);           //changing priority
	    //t.setPriority(11); IllegalArgumentException because it should 1 to 10.
	    System.out.println("Thread priority : "+t.getPriority());
	    System.out.println(t);

	    System.out.println(t.getState());  

	    }


	}


