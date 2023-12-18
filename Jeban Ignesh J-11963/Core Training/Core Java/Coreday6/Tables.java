package com.jeban.Coreday6;

import java.util.Scanner;

class table extends Thread{
	public void run() {
//		System.out.println("Enter Number:");
//		Scanner sc=new Scanner (System.in);
//		int num=sc.nextInt();
		int num=2;
		for(int i=1;i<=16;i++) {
			System.out.println(i+"*"+num+"="+(i*num));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}

}
class table1 implements Runnable{
	public void run() {
//		System.out.println("Enter Number:");
//		Scanner sc=new Scanner (System.in);
//		int num=sc.nextInt();
		int num=10;
		for(int i=1;i<=16;i++) {
			System.out.println(i+"*"+num+"="+(i*num));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}

}
class table2 implements Runnable{
	public void run() {
//		System.out.println("Enter Number:");
//		Scanner sc=new Scanner (System.in);
//		int num=sc.nextInt();
		int num=5;
		for(int i=1;i<=16;i++) {
			System.out.println(i+"*"+num+"="+(i*num));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}

}


public class Tables {

	public static void main(String[] args) throws InterruptedException {
//		Thread t=new Thread(new table());
		table t=new table();
		Thread t1=new Thread(new table1());
		Thread t2=new Thread(new table2());
		System.out.println(t);
		System.out.println(t.getName());
		t.start();
		t1.start();
//		t2.start();
//		t1.suspend();
		Thread.sleep(1000);

		t1.resume();

	}

}
