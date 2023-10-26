package com.naveen.day7;

//Printing the multiplication table using Three thread classes.

class Two implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("2 " + "* " + i + " = " + i * 2);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//
//			}
		}
		System.out.println("End of Two table Thread...");
	}
}

class Three implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("3 " + "* " + i + " = " + i * 3);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//
//			}
		}
		System.out.println("End of Three table Thread...");
	}
}

class Four implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("4 " + "* " + i + " = " + i * 4);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//
//			}
		}
		System.out.println("End of Four table Thread...");
	}
}

public class Ex08 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Two());
		Thread t2 = new Thread(new Three());
		Thread t3 = new Thread(new Four());
		
		t1.setPriority(10);
		t2.setPriority(2);
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
