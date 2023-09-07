package com.shiva.day13;

abstract class Bank
{
	Bank(int a)
	{
		System.out.println(a);
	}
	abstract void getBalance();
}

class BankA extends Bank
{
	BankA(int B)
	{
		super(B);
	}
	void getBalance()
	{
		System.out.println("Deposited");
	}
}
class BankB extends Bank
{
	BankB(int n)
	{
		super(n);
	}
	void getBalance()
	{
		System.out.println("credited");
	}
}
public class AbstractionEx1 {

	public static void main(String[] args) {
		BankB b=new BankB(500);
		b.getBalance();
//		BankA s=new BankA(100);
//		s.getBalance();
		BankA s=new BankA(1500);
		s.getBalance();
		

	}

}
