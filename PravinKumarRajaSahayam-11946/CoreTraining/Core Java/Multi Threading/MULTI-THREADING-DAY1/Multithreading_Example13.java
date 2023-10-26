//Multithreading for the join method
class MyThread9 implements Runnable {
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

public class Multithreading_Example13 {
	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread9());
		t1.setName("T1");
		t1.start();
		t1.join();

		System.out.println("The Main Thread is End");

	}

}
