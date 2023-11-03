package com.gayathri.day9Multithreading;

class MyOwnThread extends Thread{
	public void run()
	{
		for (int i=0;i<5;i++) {
			System.out.println("Own thread class running with sleep method....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				/*
				 * The printStackTrace() method in Java is a tool used to handle exceptions and errors.
				 * It is a method of Java’s throwable class which prints the throwable along with other details 
				 * like the line number and class name where the exception occurred.
				 */
			}
		}
	}
}
public class SampleOwnThead3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyOwnThread t = new MyOwnThread();
		t.start();
		
		System.out.println("Main thread"); // it depends on the system os
		
		System.out.println("Get name : "+t.getName()); //MyOwnThred
		System.out.println("Get Priority : "+t.getPriority());//5
	System.out.println("Get State : "+t.getState());
	}

}
