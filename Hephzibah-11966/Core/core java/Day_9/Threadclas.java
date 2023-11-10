package Day_9;

class MyThread extends Thread{
	public void run() {  //run is a overriden method
	for (int i=0;i<=5;i++) {
		System.out.println(Thread.currentThread().getName()+" Thread is Running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}       
		}
}
}


public class Threadclas {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.setName("T1");
		t1.start();
//		System.out.println(t1.getName());
//		System.out.println(t1.getPriority());
//		System.out.println(t1.getState());
		
		
		MyThread t2=new MyThread();
		t2.setName("T2");
		t2.start();
		
		System.out.println("Main Thread End");

	}
}


