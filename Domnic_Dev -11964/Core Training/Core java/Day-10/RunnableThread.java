package Core_Topic_Domnic_Day_10;

class MyThread4 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" Thread Running....");
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class RunnableThread {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new MyThread4());
		t1.setName("T1");
		t1.start();
		t1.join();
//		System.out.println(t1.getState()); 
//		t1.start();
//		System.out.println(t1.getState()); 
//
//        //t1.suspend();	
//	    
//	    Thread.sleep(1000);
//		System.out.println(t1.getState()); 

		System.out.println("Main Thread End ");
	   // Thread.sleep(4000);

		
		//t1.resume();
	
	}

}
