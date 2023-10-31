package EHDay2;

class MyThread3 implements Runnable{
	public void run() {
		for(int i=0; i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"My Thread Running....");
			try {
			Thread.sleep(2000);
		     }catch (InterruptedException e) {
			
		}
	}
}

public class ex6 {
	
	public static void main(String[] args) throws InterruptedException {

		Thread t1=new Thread(new MyThread());
		t1.setName("T1");
		System.out.println(t1.getState());//NEW
		t1.start();
		System.out.println(t1.getState());//Runnable
        Thread.sleep(1000);
        //t1.suspend();
        
        
        Thread.sleep(1000);
        System.out.println(t1.getState());
				
		System.out.println("Main Thread END");
		Thread.sleep(4000);
		
		t1.resume();
		
	}

}}
