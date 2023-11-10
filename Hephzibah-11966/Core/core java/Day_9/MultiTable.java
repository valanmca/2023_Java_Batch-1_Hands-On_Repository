package Day_9;

import java.util.Scanner;

class MyThread4 extends Thread{
	int num;
	MyThread4(int num)
	{
		this.num=num;
	}
	public void run() 
	{  
	for (int i=1;i<=10;i++) 
	{
		System.out.println(i+" * "+num +"="+ num*i);   
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}       
	}
}

}

class MyThread5 extends Thread{
	int num1;
	MyThread5(int num1)
	{
		this.num1=num1;
	}
	public void run() 
	{  
	for (int i=1;i<=10;i++) 
	{
		System.out.println(i+" * "+num1 +"="+ num1*i);  
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}       
	}
}

}


public class MultiTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter number: ");       
		int num=sc.nextInt();  
		System.out.print("Enter number: ");       
		int num1=sc.nextInt();  
		MyThread4 t=new MyThread4(num);
		t.start();
		MyThread5 t1=new MyThread5(num1);
		t1.start();
		

	}

}
