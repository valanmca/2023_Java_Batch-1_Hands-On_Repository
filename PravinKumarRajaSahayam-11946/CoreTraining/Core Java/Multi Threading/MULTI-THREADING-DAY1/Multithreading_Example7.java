//Multithreading extends Thread
class MyThread extends Thread 
{
	public void run() 
	{
		for(int i=1;i<=5;i++) 
		{
			System.out.println("My Thread Runnings.........");
			try 
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e) 
			{
				
			}
		}
	}
}
public class Multithreading_Example7 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		t1.start();
		System.out.println("The Main Thread is End");
			
		}

	}
