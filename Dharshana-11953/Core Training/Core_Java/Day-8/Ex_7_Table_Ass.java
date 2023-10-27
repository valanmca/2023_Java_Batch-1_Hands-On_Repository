package com.dharshu.day8;

class Table1 implements Runnable{
    public void run(){
         for (int i=1;i<=10;i++)
         {
             System.out.println(i+"*"+2+"="+(i*2));
             try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               
               
           }
         }
        
    }
}

class Table2 implements Runnable{
    public void run(){
         for (int i=1;i<=10;i++)
         {
             System.err.println(i+"*"+10+"="+(i*10));
             try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               
               
           }
         }
        
    }
}



public class Ex_7_Table_Ass {

	public static void main(String[] args)throws InterruptedException {
	        
	        Thread t1=new Thread(new Table1());
	        t1.setName("T1");
	        t1.start();
	        
	        t1.join();
	        Thread t2=new Thread(new Table2());
	        t2.setName("T2");
	        t2.start();

	}

}
