package com.core.day_07;
// create our own thread by 
// extends threads class


class MyThread1 extends Thread
{
	public void run(){
		for (int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" Thread Running.."+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				
			}
		}
	}
}
public class MyThread {

	public static void main(String[] args) { // main method is also one Thread
		
		MyThread1 t1=new MyThread1();
		t1.setName("T1");
		t1.start();
		
//		System.out.println("initially thread name = "+t1.getName());
		
//		System.out.println( "Thread name ="+t1.getName());
//		System.out.println("priority ="+t1.getPriority());
//		System.out.println(t1.getState());
		
		MyThread1 t2=new MyThread1();
		t2.setName("t2");
		t2.start();
		
		
		System.out.println("main thread end ");
		

	}

}
