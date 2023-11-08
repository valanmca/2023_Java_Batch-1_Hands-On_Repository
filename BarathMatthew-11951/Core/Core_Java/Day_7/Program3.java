package Day_7;

class MyThread extends Thread{
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

public class Program3 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		
//		Thread state
		System.out.println("State : " + t1.getState());
		System.out.println();
		
//		starting thread
		t1.start();
		
//		before updating
		System.out.println("Name :"+ t1.getName());
		System.out.println("Priority : "+ t1.getPriority());
		System.out.println("State : " + t1.getState());
		System.out.println();
		
//		After updating 
		t1.setName("T1");
		System.out.println("Name : "+t1.getName());
		System.out.println("Main Thread");
		System.out.println();
		t1.join();
		System.out.println("State : " + t1.getState());
		System.out.println();
		
//		Creating Another thread object
		MyThread t2 = new MyThread();
		System.out.println("State of t2 : " + t2.getState());
		t2.setName("t2");
		t2.start();
		System.out.println("State of t2 : " + t2.getState());
	}

}
