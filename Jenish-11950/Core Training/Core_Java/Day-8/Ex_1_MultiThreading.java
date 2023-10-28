package com.jenish.day08;
 
//everything is prefined method from thread class
//3 Constant Variables min, norm, max
//Priority values: 1 - 10
public class Ex_1_MultiThreading {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);  //Thread[main,5,main] Priority Value--> Min Value - 1, Normal/Default Value - 5, Max Value - 10
								//main --> 
		System.out.println(t.getName());  //main
		
		System.out.println(t.getPriority()); //5-->Default Priority Value 
		System.out.println(Thread.MIN_PRIORITY); //1
		System.out.println(Thread.NORM_PRIORITY); //5
		System.out.println(Thread.MAX_PRIORITY); //10
		
		t.setName("Jenish");
		System.out.println(t.getName()); //Jenish
										//Thread[Jenish,5,main]
		System.out.println(t);
		
		t.setPriority(8);
		System.out.println(t.getPriority()); //8
											//Thread[Jenish,8,main]
		System.out.println(t);
		
//		t.setPriority(12);
//		System.out.println(t.getPriority()); //IllegalArgumentException beyond the limit
//		System.out.println(t);
		
		System.out.println(t.getState());  //RUNNABLE 
	}

}
