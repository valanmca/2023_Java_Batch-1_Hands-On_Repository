package com.aravind.day14;
interface BankFDplan
{
	void fixedDeposit();
	void interestRate();
}
abstract class BankFD implements BankFDplan 
{
	public void fixedDeposit()
	{
		System.out.print("WE PROVIDE FD");
	}
	public abstract void interestRate();
	
}

class HDFCFD extends BankFD
{
	public void interestRate()
	{
		System.out.println("@ 7.5");
	}

}
class SBIFD extends BankFD
{
	public void interestRate()
	{
		System.out.println("@ 6.5");
	}

}

public class InterfaceUsingbank {

	public static void main(String[] args) {
		HDFCFD obj=new HDFCFD();
		obj.fixedDeposit();
		obj.interestRate();
		SBIFD obj1=new SBIFD();
		obj1.fixedDeposit();
		obj1.interestRate();
		
		

	}

}
