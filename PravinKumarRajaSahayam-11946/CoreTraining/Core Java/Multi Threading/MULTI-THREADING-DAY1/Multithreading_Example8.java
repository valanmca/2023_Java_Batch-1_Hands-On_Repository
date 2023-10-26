//Multithreading extends Thread set thread names
class MyThread1 extends Thread 
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
public class Multithreading_Example8 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1();
		t1.setName("T1");
		System.out.println(t1.getName()); //T1
		System.out.println(t1.getPriority()); //5
		System.out.println(t1.getState()); // NEW
		t1.start();
		System.out.println("The Main Thread is End");
			
		}

	}
