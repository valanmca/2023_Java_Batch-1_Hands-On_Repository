package EHDay1;


class Num implements Runnable {
	public void run (){
		for(int i=0;i<5;i++) {
		System.out.println(i);
		try {
			Thread.sleep(3000);	
		}
		catch(InterruptedException e){
			e.printStackTrace();	
		}
		}
	}
}
class Ex implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("hi");
		}
	}
}
public class Multithreding {

	private static Runnable obj1;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Runnable obj=new Num();	
		Runnable obj2=new Ex();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		t1.setName("Number");
		System.out.println(t1.getName());
		
		t1.start();
		t1.join();
		t1.run();
	}
}
