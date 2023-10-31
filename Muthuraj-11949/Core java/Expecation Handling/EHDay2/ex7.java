package EHDay2;
class MyThread4 implements Runnable{
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
public class ex7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t1=new  Thread(new MyThread());
		t1.setName("T1");
		t1.start();
		
		t1.join();
		
		
		System.out.println("Main Thread END");
		

	}

}
