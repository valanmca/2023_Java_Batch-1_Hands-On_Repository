package EHDay2;

///Multiple threading used in Case Condition
class MyThread1 extends Thread{
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
public class ex4 {

	public static void main(String[] args) {

		
		MyThread1 t1=new MyThread1();
		t1.setName("T1");
		t1.start();
		
		MyThread1 t2=new MyThread1();
		t2.setName("T2");
		t2.start();
		
		
		System.out.println("Main Thread END");

	}

}
