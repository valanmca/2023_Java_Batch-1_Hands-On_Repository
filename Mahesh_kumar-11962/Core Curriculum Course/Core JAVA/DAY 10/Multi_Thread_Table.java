package com.mahesh.core_java_day_10;

class Table_Second implements Runnable {

	public void run() {

		for (int index = 1; index <= 10; index++) {
			System.out.println(index + " * " + 2 + " = " + index * 2 + " Thread 1 is running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class Table_Third implements Runnable {

	
	public void run() {

		for (int index = 1; index <= 10; index++) {
			System.out.println(index + " * " + 3 + " = " + index * 3 + " Thread 2 is running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class Table_Five implements Runnable {

	public void run() {

		for (int index = 1; index <= 10; index++) {
			System.err.println(index + " * " + 5 + " = " + index * 5 + " Thread 3 is running...");
			try {
				
				Thread.sleep(7000);
				
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

public class Multi_Thread_Table {

	public static void main(String[] args) throws InterruptedException {
		Thread table2 = new Thread(new Table_Second());
		table2.start();
		System.out.println("\n");
		

		table2.getState();
		Thread table3 = new Thread(new Table_Third());
		table3.start();
		

		Thread table5 = new Thread(new Table_Five());
		table5.start();

	}

}
