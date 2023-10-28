package com.jenish.day08;
//Runnable predefined from java.lang package
//It has exactly have only one abstract method
//functional interface is one with only one abstract method.
//marker interface is an interface declaring no methods,It is an empty interface (no field or methods)
// Examples of marker interface are Serializable, Cloneable and Remote interface. All these interfaces are empty interfaces.


class MyThread1 implements Runnable{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+"Thread Running....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class Ex_4_ThreadClass_2ndWay_Implements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread());
		t1.setName("T1");
		t1.start();

		Thread t2 = new Thread(new MyThread());
		t2.setName("T2");
		t2.start();
	
		
		
		System.out.println("Main Thread END");
		
	}

}
