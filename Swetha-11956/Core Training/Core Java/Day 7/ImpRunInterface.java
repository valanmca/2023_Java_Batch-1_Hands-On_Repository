package Java7;

class MyThread1 implements Runnable { //Runnable _ predefined interface from lang package
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
public class ImpRunInterface {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread1());
		t1.setName("T1");
		t1.start();
		
		Thread t2=new Thread(new MyThread1());
		t2.setName("T2");
		t2.start();   //To start the thread
		
		System.out.println("Main thread END");
	}

}
