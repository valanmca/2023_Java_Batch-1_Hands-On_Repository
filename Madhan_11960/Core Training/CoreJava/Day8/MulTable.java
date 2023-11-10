package com.madhan.coreday08;
import java.util.Scanner;
class A extends Thread
{
	int num;
	A(int num)
	{
		this.num=num;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(i+"*"+num  +"=" +num*i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			
			}
		}
	}
}

class B extends Thread
{
	int num;
	B(int num)
	{
		this.num=num;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(i+"*"+num  +"=" +num*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
			}
		}
	}
}

public class MulTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int n=sc.nextInt();
		System.out.println("Enter second number:");
		int n1=sc.nextInt();
	
		A t1=new A(n);
		t1.start();
		
		B t2=new B(n1);
		t2.start();
	}

}
