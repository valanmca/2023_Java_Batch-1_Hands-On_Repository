package Day_9;

class MyThread2 implements Runnable
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

public class suspend {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyThread2()); //this is the way create a thread object if implementing runnable interface
		t1.setName("T1");
		t1.start();
		System.out.println(t1.getState());
		
		t1.suspend();  //suspending a method
		               //This method is used if you want to stop the thread execution and start it again when a certain event occurs.
		
		Thread t2=new Thread(new MyThread2());
		t2.setName("T2");
		t2.start();
		
		t1.resume();
		
		System.out.println("Main thread End");
	}
		

	}


