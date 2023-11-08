package Day_7;

//Using Runnable

class MyThread1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" is running .....");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}	
		}
	}
}
public class Program4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread1());
		t1.setName("t1");
		t1.start();
		
		Thread t2 = new Thread(new MyThread1());
		t2.setName("t2");
		t2.start();
		
		System.out.println("Main Thread Ends");
	}

}
