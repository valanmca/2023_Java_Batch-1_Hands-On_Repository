package com.shiva.core.day09;

public class MultiThread_01 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t); // Thread[main,5,main]
		System.out.println(t.getName()); // main
		System.out.println(t.getPriority()); // 5
		System.out.println();
		
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.NORM_PRIORITY);//5
		System.out.println(Thread.MAX_PRIORITY);//10
		System.out.println();
		
		t.setName("Shiva");
		System.out.println(t.getName());//Shiva
		System.out.println(t);//Thread[Shiva,5,main]
		System.out.println();
		
		t.setPriority(8);
		System.out.println(t.getPriority());//8
		System.out.println(t);//Thread[Shiva,5,main]
		System.out.println();
		
		System.out.println(t.getState());//Runnable
	}

}
