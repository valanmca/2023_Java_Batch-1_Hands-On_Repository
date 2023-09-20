package com.dharshu.assessment;

interface Accounts{
	public abstract void deposite();
	public abstract void withdraw();
	public abstract void calculate_interest() ;
	public abstract void viewBalance();
	
}
class Bank1{
	public void list() {
		System.out.println("\n Saving Accounts....");
		System.out.println("\n Deposite Accounts....");
		
	}
}



 class SavingsAccount implements Accounts{

	
	public void deposite() {
		int dep=500;
		System.out.println("The deposited amount:"+dep);
		
	}

	
	public void withdraw() {
		int with=200;
		System.out.println("The deposited amount:"+with);
	}

	
	public void calculate_interest() {
		
		
	}
	public void viewBalance() {
		int bal=0;
		System.out.println("The available Balance:"+bal);
		
	}
 }
class CurrentAccount implements Accounts{

	public void deposite() {
		int dep=1000;
		System.out.println("The deposited amount is :"+dep);
		
	}

	public void withdraw() {
		int with=500;
		System.out.println("The withdraw amount is :"+with);
		
	}

	public void calculate_interest() {
		
	}
	
	public void viewBalance() {
		int bal=0;
		System.out.println("The available Balance:"+bal);
		
	}
	
}


public class Bank {

	public static void main(String[] args) {
		Bank1 ban=new Bank1();
		ban.list();
		
		SavingsAccount sa=new SavingsAccount();
		sa.deposite();
		sa.withdraw();
		sa.calculate_interest();
		sa.viewBalance();
		
		CurrentAccount ca= new CurrentAccount();
		ca.deposite();
		ca.withdraw();
		ca.calculate_interest();
		ca.viewBalance();

	}

}
