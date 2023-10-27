package com.dharshu.day8;

public class Ex_1_MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread(); // to get current thread
		System.out.println(t);
		// O/P ---> Thread[main,5,main]
		// main --> name of the thread.
	// 5 --> priority of the thread.(priority 1 to 10) -->minimum-1,default-5,maximum-10
		// main --> thread group name
		
		System.out.println(t.getName()); //main (name of our current thread)
		System.out.println(t.getPriority()); //5
		
		System.out.println(Thread.MIN_PRIORITY); //1
		System.out.println(Thread.NORM_PRIORITY); //5
		System.out.println(Thread.MAX_PRIORITY);  //10
		
		t.setName("Dharshu");
		System.out.println(t.getName()); // Dharshu 
		System.out.println(t);
		
		t.setPriority(8);
		System.out.println(t.getPriority());
		System.out.println(t);
		
		//t.setPriority(18);
		//System.out.println(t.getPriority());
		//System.out.println(t);
		
		System.out.println(t.getState()); //RUNNABLE
	}
}
