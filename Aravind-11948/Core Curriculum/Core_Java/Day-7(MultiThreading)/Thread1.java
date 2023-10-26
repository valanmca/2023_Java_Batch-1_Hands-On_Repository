package com.core.day_07;
import java.lang.*;  //default package

public class Thread1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t); //Thread[main,5,main]
		System.out.println(t.getName()); //main
		System.out.println(t.getPriority()); //5
		System.out.println(t.getThreadGroup());
		
		// 3 constants defined in Thread class:
		
		System.out.println(Thread.MIN_PRIORITY); // default static final ans=1
        System.out.println(Thread.NORM_PRIORITY);// default static final ans=5
        System.out.println(Thread.MAX_PRIORITY);// default static final ans=10
        
        // Set thread name 
        
        t.setName("Aravind");
        
        System.out.println(t.getName());
        
        System.out.println(t);
        
        t.setPriority(8);
        
        System.out.println(t.getPriority());
        System.out.println(t);
        try {
        	
       
        t.setPriority(11);  //java.lang.IllegalArgumentException because priority is 1 to 10
        }
        
        catch(IllegalArgumentException e)
        {
        	System.out.println("range must be 1 to 10 "+ "  "+e);
        }
        
        System.out.println(t.getState());

	}

}
