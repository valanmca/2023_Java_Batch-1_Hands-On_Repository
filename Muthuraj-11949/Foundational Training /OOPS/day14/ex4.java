//abstract class create interface 

package com.muthu.day14;
interface BankFDPlan{//n number of 
	void fixedDeposit();//abstract method
	void interestRate();//concrete method
}
abstract class BankFD implements BankFDPlan{
	public void fixedDeposit() {
		System.out.println("We are Provind Fixed Deposit");}
	public abstract void interestRate();
	}
	class  HDFCFD extends BankFD{
		public void interestRate() {
			System.out.println("@6.6 rate");
	}	
}
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HDFCFD hdfc=new HDFCFD();
   hdfc.fixedDeposit();
   hdfc.interestRate();
   
	}

}
