package Day_7;

class MyThread2 implements Runnable{
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

public class Program5 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread2());
		System.out.println("State : " + t1.getState());
		System.out.println();
		t1.setName("t1");
		t1.start();
		System.out.println("State : " + t1.getState());
		System.out.println();
		
		t1.suspend();
		Thread.sleep(8000);
		System.out.println("State : " + t1.getState());
		System.out.println();
		
		System.out.println("Main Thread Ends");
		Thread.sleep(8000);
		
		System.out.println("State : " + t1.getState());
		System.out.println();
		
		t1.resume();

	}

}
