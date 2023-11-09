package com.jeyavel.coreDay7;

//there are two ways to implement the thread class 
//1 extends the thread class 
//2 implements the runnable interface 
public class MultithreadingExNo2 {

	public static void main(String[] args) throws InterruptedException {
		//sleep is the predefined static thread class
		//sleep - it will delay or suspending the current 
        for(int i=1;i<=5;i++) {
        	System.out.println("Main thread is running....");
        	Thread.sleep(2000);
        	

        }
	}

}
