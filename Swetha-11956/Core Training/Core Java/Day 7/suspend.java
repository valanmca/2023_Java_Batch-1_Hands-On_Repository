package Java7;

class MyThread2 implements Runnable { //Runnable _ predefined interface from lang package
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" Thread is running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class suspend {

	public static void main(String[] args) throws InterruptedException{

		Thread t1 = new Thread(new MyThread1());
		t1.setName("T1");
		System.out.println(t1.getState()); //NEW
		t1.start();
		System.out.println(t1.getState()); //RUNNABLE
		Thread.sleep(1000);
		
		t1.suspend();
		
		Thread.sleep(1000);
		System.out.println(t1.getState()); //waiting
		
		System.out.println("Main thread end");
		Thread.sleep(4000);
		t1.resume();
	}

}
