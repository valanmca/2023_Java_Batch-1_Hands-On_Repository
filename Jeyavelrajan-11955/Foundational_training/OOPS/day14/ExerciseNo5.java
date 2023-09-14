package com.jeyavel.OOPS.day14;

interface BankFDplan {
	void fixedDeposit();

	void interestRate();
}

//Abstract class have the copy of its declaration
abstract class BankFD implements BankFDplan {
	public void fixedDeposit() {//concerete Method
		System.out.println("We Are Providing Fixed Deposit ");
	}
	public abstract void interestRate();//it is optional
}

//use extends because we shift abstract class to Normal class
class HDFCFD extends  BankFD{
	public void interestRate() {
		System.out.println("Fixed deposit interest in HDFC -> 7.5%");
	}
}
class SBIFD extends  BankFD{
	public void interestRate() {
		System.out.println("Fixed deposit interest in SBI  -> 6.5%");
	}
}

public class ExerciseNo5 {

	public static void main(String[] args) {
      HDFCFD hdfc =new HDFCFD();
      hdfc.fixedDeposit();
      hdfc.interestRate();
      
      SBIFD sbi = new SBIFD();
      sbi.fixedDeposit();
      sbi.interestRate();
	}

}
