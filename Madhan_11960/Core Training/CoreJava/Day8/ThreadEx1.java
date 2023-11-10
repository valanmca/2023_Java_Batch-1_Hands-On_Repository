package com.madhan.coreday08;

public class ThreadEx1 {

	public static void main(String[] args) {
      Thread t = Thread.currentThread();
      System.out.println(t);

      System.out.println(t.getName());
      System.out.println(t.getPriority());
      
      
      System.out.println(Thread.MIN_PRIORITY); //1
      System.out.println(Thread.NORM_PRIORITY); //5
      System.out.println(Thread.MAX_PRIORITY); //10
      
      t.setName("Madhan");
      System.out.println(t.getName());
      System.out.println(t);
      
      t.setPriority(7); //IllegalArgumentException because priority value is only between 1 to 10. 
      System.out.println(t.getPriority());
      System.out.println(t);
      
      System.out.println(t.getState());

	}

}
