package Core_Topic_Domnic_Day_10;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My thread is running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadCreation {

	public static void main(String[] args) {
   MyThread t=new MyThread();
   
   t.setName("T");
   System.out.println("Thread name : "+t.getName());
   System.out.println("Priority : "+t.getPriority());
   System.out.println("State : "+t.getState());
   
   t.start();
   System.out.println("Main thread End");
	}

}
