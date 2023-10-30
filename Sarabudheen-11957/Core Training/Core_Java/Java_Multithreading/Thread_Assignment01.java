package com.sara.CoreJava.Day_09;

class Table_One extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + 1 + " = " + (i * 1));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}
}

class Table_Two extends Thread {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + 2 + " = " + (i * 2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

class Table_Three extends Thread {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + 3 + " = " + (i * 3));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Thread_Assignment01 {

	public static void main(String[] args) {
		Table_One t1 = new Table_One();
		t1.start();
		Table_Two t2 = new Table_Two();
		t2.start();
		Table_Three t3 = new Table_Three();
		t3.start();

	}

}
