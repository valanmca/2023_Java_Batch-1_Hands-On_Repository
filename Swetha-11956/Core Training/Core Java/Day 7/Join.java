package Java7;

class MyThread3 implements Runnable{
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
public class Join {

	
	public static void main(String[] args) throws InterruptedException{

		//suspending the main thread until the completion of t1
		Thread t1= new Thread(new MyThread3());
		t1.setName("T1");
		t1.start();
		t1.join();
		System.out.println("Main thread end");
		
	}

}
