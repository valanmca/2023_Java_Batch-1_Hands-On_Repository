package com.shiva.day14;

interface BankFDPlan
{
	void fixedDeposit();
	void intrestRate();
}

abstract class BankFD implements BankFDPlan
{
	public void fixedDeposit()
	{
		System.out.println("We are providing Fixed Deposit");
	}
	public abstract void intrestRate();
}

class HDFCFD extends BankFD
{
	public void intrestRate()
	{
		System.out.println("The intrest Rate : @ 7.5");
	}
}

class SBI extends BankFD
{
	public void intrestRate()
	{
		System.out.println("The intrest Rate : @ 7.0");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		
		HDFCFD hdfc=new HDFCFD();
		hdfc.fixedDeposit();
		hdfc.intrestRate();
		
		SBI sbi=new SBI();
		sbi.fixedDeposit();
		sbi.intrestRate();
	}

}
