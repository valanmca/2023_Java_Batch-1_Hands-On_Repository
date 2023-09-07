package com.madhan.day14;

interface Bank
{
	void fixedDeposit();
	void interestRate();
}

abstract class BankFd implements Bank
{
	public void fixedDeposit()
	{
		System.out.print("We are providing fixed deposit");
	}
	public abstract void interestRate();
}

class HDFC extends BankFd
{
	public void interestRate()
	{
		System.out.println(" at 7.5% ");
	}
}

class SBI extends BankFd
{
	public void interestRate()
	{
		System.out.println("at 7%");
	}
}
public class InterfaceusingBank {

	public static void main(String[] args) {
	    HDFC hdfc=new HDFC();
	    hdfc.fixedDeposit();
	    hdfc.interestRate();
        
	    SBI sb=new SBI();
	    sb.fixedDeposit();
	    sb.interestRate();
	}

}
