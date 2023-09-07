package com.jeban.OOPsday7;

interface TaxCalculator{
	int TaxPercent=15;
	double YeralyIncomeTax();
	double YearlyIncomeWithoutTax();
}

abstract class Employee12 implements TaxCalculator{
	private int id;
	private String Name;
	private int Age;
	
	public Employee12(int id,String Name,int Age){
		this.id=id;
		this.Name=Name;
		this.Age=Age;
		
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	abstract int yearlySalary();
	abstract int YeralyIncome();
	

	
	
}
class Faculty extends Employee12   {
	private String initial;
	private int monthlySalary;
	private int yearlyBonus;
	public Faculty(String initial, int monthlySalary, int yearlyBonus,int id,String Name,int Age) {
		super(id,Name,Age);
		this.initial = initial;
		this.monthlySalary = monthlySalary;
		this.yearlyBonus = yearlyBonus;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getYearlyBonus() {
		return yearlyBonus;
	}
	public void setYearlyBonus(int yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}
	@Override
	public double YeralyIncomeTax() {
		
		
		return 0;
	}
	@Override
	public double YearlyIncomeWithoutTax() {
		
		return 0;
	}
	@Override
	int yearlySalary() {
		
		
		
		return this.monthlySalary*12 ;
	}
	@Override
	int YeralyIncome() {
		
		
		
		
		return this.monthlySalary*12+this.yearlyBonus;
	}

	@Override
	public String toString() {
		return "Faculty [initial=" + initial + ", monthlySalary=" + monthlySalary + ", yearlyBonus=" + yearlyBonus
				+ ", getMonthlySalary()=" + getMonthlySalary() + ", getYearlyBonus()=" + getYearlyBonus()
				+ ", YeralyIncomeTax()=" + YeralyIncomeTax() + ", YearlyIncomeWithoutTax()=" + YearlyIncomeWithoutTax()
				+ ", yearlySalary()=" + yearlySalary() + ", YeralyIncome()=" + YeralyIncome() + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

	
}


public class UML1 {

	public static void main(String[] args) {
		Faculty obj=new Faculty("J",100000,4500,101,"Jeban",23);
		System.out.println(obj.getAge());
		System.out.println(obj.getMonthlySalary());
		System.out.println("Yearly Salary:"+obj.yearlySalary());
		System.out.println("Yearly Income:"+obj.YeralyIncome());
		
		
		
	}

}
