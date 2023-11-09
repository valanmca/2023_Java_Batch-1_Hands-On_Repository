package com.jeyavel.coreDay7;

//multithreading is dividing the single task into Multiple parts 
// all the games following the Multithreading concept 
//By Default java is a multithreading programming Language 

//thread is a predefined  class form lang
public class MultithreadingExNo1 {

	public static void main(String[] args) {
		//get the current thread object 
		Thread t = Thread .currentThread();
		    //t-object
		System.out.println(t);//thread[main->name of the thread,5->priority,main->thread group name]
		
		//priority can be between 1-MinPriority to 10-MaxPriority
		// 5 is the normal and basic priority 
		
		System.out.println(t.getName());//main
		System.out.println(t.getPriority());//5
		
		//There are three types of constant static priority
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.NORM_PRIORITY);//5
		System.out.println(Thread.MAX_PRIORITY);//10
		
		//how to rename the thread 
		t.setName("jeyavel");
		System.out.println(t.getName());
		System.out.println(t);
		
		//how to set diff priority to the thread
		t.setPriority(8);
		System.out.println(t.getPriority());
		System.out.println(t);
		
		//Invalid priority range
		//It throws the runtime error called the illegal Argument 
//		t.setPriority(12);
//		System.out.println(t.getPriority());
//		System.out.println(t);
		
		
		//State is the method to get the state of the current thread 
		System.out.println(t.getState());//RUNNABLE
		
		
		
		
		
		
		

	}

}
