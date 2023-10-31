package EHDay2;
class MyThread extends Thread{
	public void run() {
		for(int i=0; i<=5;i++) {
			System.out.println("My Thread Running....");
			try {
			Thread.sleep(2000);
		     }catch (InterruptedException e) {
			
		}
	}
}
}
public class ex3 {
	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.start();
		System.out.println("Main Thread END");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getState());
		t1.start();
		
		System.out.println("Main Thread END");

	}

}
