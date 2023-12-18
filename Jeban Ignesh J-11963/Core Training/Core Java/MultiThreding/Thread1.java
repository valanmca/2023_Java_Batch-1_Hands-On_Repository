package com.jeban.MultiThreding;

public class Thread1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName());//main
        System.out.println(t.getPriority());//5
        
        System.out.println("Minimum Priority:"+Thread.MIN_PRIORITY);//1
        System.out.println("Normal Priority:"+Thread.NORM_PRIORITY);//5
        System.out.println("Maximum Priority:"+Thread.MAX_PRIORITY);//10
        
        t.setName("Jeban");
        System.out.println(t.getName());//Jeban
        System.out.println(t);//Jeban,5,main
        
        t.setPriority(8);
        System.out.println(t.getPriority());//8
        System.out.println(t);//Jeban,8,main
        
        System.out.println(t.getState());//Runnable
        
        
	}

}
