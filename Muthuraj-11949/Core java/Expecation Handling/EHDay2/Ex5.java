package EHDay2;
///Two way In java

class MyThread2 implements Runnable{
	public void run() {
		for(int i=0; i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"My Thread Running....");
			try {
			Thread.sleep(2000);
		     }catch (InterruptedException e) {
			
		}
	}
}
}
public class Ex5 {
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new MyThread());
		t1.setName("T1");
		t1.start();
		
		Thread t2=new Thread(new MyThread());
		t2.setName("T2");
		t2.start();
		
		
		System.out.println("Main Thread END");


	}

}
