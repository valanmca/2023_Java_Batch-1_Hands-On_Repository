//Multithreading suspend and the resume
class MyThread0 implements Runnable {
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

public class Multithreading_Example12 {
	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread0());
		System.out.println(t1.getState()); // NEW
		t1.start();
		System.out.println(t1.getState()); // RUNNABLE
		Thread.sleep(4000);
		//t1.suspend();
		Thread.sleep(1000);
		System.out.println(t1.getState()); // WAITING
		System.out.println("The Main Thread is End");
		Thread.sleep(5000);
		t1.resume();
	}

}
