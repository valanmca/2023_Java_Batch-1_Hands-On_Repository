package Core_Topic_Domnic_Day_10;

class MyThread2 extends Thread{
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

public class MyThread1 {

	public static void main(String[] args) {
		MyThread2 t1=new MyThread2();
		t1.setName("T1");
		t1.start();
		
		MyThread2 t2=new MyThread2();
		t2.setName("T2");
		t2.start();
		
		System.out.println("Main Thread End ");
	}

}
