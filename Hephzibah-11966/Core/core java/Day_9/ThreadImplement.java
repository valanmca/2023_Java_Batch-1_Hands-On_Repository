package Day_9;

//It has only one abstract class that is Run
//functional interface is an interface that contains only one abstract method. eg:Runnable
//Marker Interface is an empty interface (no field or methods)

class MyThread1 implements Runnable
{
	public void run() 
	{  
		for (int i=0;i<=5;i++) 
		{
			System.out.println(Thread.currentThread().getName()+" Thread is Running");
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}       
		}
	}
	
}


public class ThreadImplement {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyThread1()); //this is the way create a thread object if implementing runnable interface
		t1.setName("T1");
		t1.start();
		
		Thread t2=new Thread(new MyThread1());
		t2.setName("T2");
		t2.start();
		
		System.out.println("Main thread End");
	}

}
