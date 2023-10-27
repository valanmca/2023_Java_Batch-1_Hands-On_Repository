package Java7;

//  --> Two threads in this program ( MyThread, main thread) both run simultaneouly....

class MyThread extends Thread{
	public void run() {     //run is overridden method from thread class
		for(int i=0;i<5;i++) {
			System.out.println("Thread is running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class CreateThread {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.setName("T1");
		t1.start();
		System.out.println(t1.getName());  //T1
		System.out.println(t1.getPriority());  //5
		System.out.println(t1.getState());  //NEW  --> whenever creating a thread ,it will be in new state.
		
		
		MyThread t2=new MyThread();
		t2.setName("T2");
		t2.start();   //To start the thread
		
		System.out.println("Main thread END");
	}

}
