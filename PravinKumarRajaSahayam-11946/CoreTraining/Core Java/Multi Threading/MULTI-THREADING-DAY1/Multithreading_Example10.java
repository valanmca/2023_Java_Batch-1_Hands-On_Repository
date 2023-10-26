//Multithreading implements for the Runnables
class MyThreads implements Runnable {
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

public class Multithreading_Example10 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThreads());
		t1.setName("T1");
		t1.start();

		Thread t2 = new Thread(new MyThreads());
		t2.setName("T2");
		t2.start();

		Thread t3 = new Thread(new MyThreads());
		t3.setName("T3");
		t3.start();

		System.out.println("The Main Thread is End");

	}

}
