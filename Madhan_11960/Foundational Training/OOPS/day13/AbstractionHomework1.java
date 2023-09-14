package com.madhan.day13;

abstract class Bank
{
	Bank()
	{
		System.out.println("State Bank");
	}
//	Bank(int a)
//	{
//		System.out.println(a);
//	}
	abstract void getBalance();
	abstract void getDeposited();
	
	void getCredited()
	{
		System.out.println("Rupees 1000 credited");
	}
}

class BankA extends Bank
{
	BankA()
	{
		super();
	}
//	BankA(int a)
//	{
//		super(10);
//	}
	void getBalance()
	{
		System.out.println("Balance is 1000");
	}
	void getDeposited()
	{
		System.out.println("Rupees 500 is deposited");
	}	
}

class BankB extends Bank
{
//	BankB(int a)
//	{
//		super(120);
//	}
	void getBalance()
	{
		System.out.println("Balance is 10000");
	}
	void getDeposited()
	{
		System.out.println("Rupees 5500 is deposited");
	}
}
public class AbstractionHomework1 {

	public static void main(String[] args) {
//		BankB canara=new BankB();
//		canara.getBalance();
//		canara.getDeposited();
//        
//		BankA hdfc=new BankA();
//		hdfc.getBalance();
//		hdfc.getDeposited();
		
		Bank state=new BankA();
		state.getBalance();
		state.getDeposited();
		state.getCredited();
	}

}
