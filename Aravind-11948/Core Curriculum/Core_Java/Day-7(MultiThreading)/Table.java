package com.core.day_07;

class Table1 implements Runnable{
	 public void run(){
		 System.out.println("Thread 1");
		  for (int i=1;i<=10;i++)
		  {
			  System.out.println(i+"*"+ 2 +"="+(i*2));
			  try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				
			}
		  }
		 
	 }
}

class Table2 implements Runnable{
	 public void run(){
		 System.out.println("Thread 2");
		  for (int i=1;i<=10;i++)
		  {
			  System.err.println(i+"*"+10+"="+(i*10));
			  try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				
			}
		  }
		 
	 }
}

class Table3 implements Runnable{
	 public void run(){
		 System.out.println("Thread 3");
		  for (int i=1;i<=10;i++)
		  {
			  System.out.println(i+"*"+5+"="+(i*5));
			  try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				
			}
		  }
		 
	 }
}



public class Table {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(new Table1());
		t1.setName("T1");
		t1.start();
		
		t1.join();
		
		Thread t2=new Thread(new Table2());
		t2.setName("T2");
		t2.start();
		
		t2.join();
		
		Thread t3=new Thread(new Table3());
		
		t3.start();

	}

}
