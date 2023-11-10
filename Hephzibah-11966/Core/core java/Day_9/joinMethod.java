package Day_9;


class MyThread3 implements Runnable
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
public class joinMethod {

	public static void main(String[] args) throws InterruptedException{
		Thread t1=new Thread(new MyThread3()); 
		t1.setName("T1");
		t1.start();
		
	
		t1.join();
		
		System.out.println("Main thread End");
	}
		

	}


