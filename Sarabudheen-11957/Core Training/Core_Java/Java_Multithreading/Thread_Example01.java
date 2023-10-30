/*** Thread Example with currentTread,getName,getPriority,
 MIN_PRIORITY,NORM_PRIORITY,MAX_PRIORITY,setName,setPriority 
 and getState methods***/
package com.sara.CoreJava.Day_09;

public class Thread_Example01 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t); // Thread[main,5,main] ==> Thread[Name of the Tread,Priority,Thread group name]
		System.out.println(t.getName()); // main
		System.out.println(t.getPriority()); // 5

		System.out.println(Thread.MIN_PRIORITY);// 1
		System.out.println(Thread.NORM_PRIORITY);// 5
		System.out.println(Thread.MAX_PRIORITY);// 10

		t.setName("Sara");
		System.out.println(t.getName());
		System.out.println(t);

		t.setPriority(7);
		System.out.println(t.getPriority());
		System.out.println(t);

//		t.setPriority(18);
//		System.out.println(t.getPriority()); //IllegalArgumentException
//		System.out.println(t);

		System.out.println(t.getState());// RUNNABLE
	}

}
