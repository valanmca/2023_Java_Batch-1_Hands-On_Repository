//Multithreading extends Thread getting the thread names
class MyThread5 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + "Thread Runnings.........");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Multithreading_Example9 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		MyThread5 t1 = new MyThread5();
		t1.setName("T1");
		t1.start();

		MyThread5 t2 = new MyThread5();
		t2.setName("T2");
		t2.start();

		MyThread5 t3 = new MyThread5();
		t3.setName("T3");
		t3.start();

		System.out.println("The Main Thread is End");

	}

}
